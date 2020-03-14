import PrintTreeLayer
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
class KthNode:
    def kthNode(self, root, k):
        self.res = []
        self.dfs(root)
        return self.res[k-1] if 0 < k <= len(self.res) else None
    def dfs(self, root):
        if not root:
            return
        self.dfs(root.left)
        self.res.append(root)
        self.dfs(root.right)
if __name__ == '__main__':
    test = KthNode()
    array = [5, 3, 7, 2, 4, 6, 8]
    p = PrintTreeLayer.PrintTreeLayer()
    root = p.arrayToTree(array, 0)
    print(test.kthNode(root, 3).val)