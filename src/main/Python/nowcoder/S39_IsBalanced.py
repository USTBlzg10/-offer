import PrintTreeLayer
class IsBalanced:
    def isBalanced(self, root):
        if not root:
            return True
        if abs(self.getDepth(root.left) - self.getDepth(root.right)) > 1:
            return False
        return self.isBalanced(root.left) and self.isBalanced(root.right)
    def getDepth(self, root: object) -> object:
        ld = self.getDepth(root.left)
        rd = self.getDepth(root.right)
        if ld > rd:
            return (ld-rd)+1
        else:
            return (rd-ld)+1
if __name__=='__main__':
    test = IsBalanced()
    p = PrintTreeLayer.PrintTreeLayer()
    array = [1, 2, 3, 4, 5, None, None, 6]
    root = p.arrayToTree(array, 0)
    print(test.isBalanced(root))