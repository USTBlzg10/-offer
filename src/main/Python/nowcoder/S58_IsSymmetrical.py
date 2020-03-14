import PrintTreeLayer
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
class IsSymmetrical:
    def isSymmetrical(self, pRoot):
        if not pRoot:
            return True
        return self.compare(pRoot.left, pRoot.right)
    def compare(self, pRoot1, pRoot2):
        if not pRoot1 and not pRoot2:
            return True
        if not pRoot1 or not pRoot2:
            return False
        if pRoot1.val == pRoot2.val:
            if self.compare(pRoot1.left, pRoot2.right) and self.compare(pRoot1.right, pRoot2.left):
                return True
        return False
if __name__ == '__main__':
    test = IsSymmetrical()
    p = PrintTreeLayer.PrintTreeLayer()
    array = [1, 2, 2, 3, 4, 4, 3]
    root = p.arrayToTree(array, 0)
    print(test.isSymmetrical(root))
