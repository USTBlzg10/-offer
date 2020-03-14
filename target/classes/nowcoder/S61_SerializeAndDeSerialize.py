class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
class SerializeAndDeSerialize:
    def __init__(self):
        self.flag = -1
    def serialize(self, root):
        if not root:
            return '#,'
        return str(root.val)+','+self.serialize(root.left)+self.serialize(root.right)
    def deSerialize(self, str):
        self.flag += 1
        l = str.split(',')
        if self.flag >= len(str):
            return None
        root = None

        if l[self.flag] != '#':
            root = TreeNode(int(l[self.flag]))
            root.left = self.deSerialize(str)
            root.right = self.deSerialize(str)
        return root