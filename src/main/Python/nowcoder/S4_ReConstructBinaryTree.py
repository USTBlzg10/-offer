from PrintTreeLayer import PrintTreeLayer
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
class Solution:
    def reConstructBinaryTree(self, pre, tin):
        # write code here
        if len(pre) == 0:
            return None
        if len(pre) == 1:
            return TreeNode(pre[0])
        else:
            root = TreeNode(pre[0])
            root.left = self.reConstructBinaryTree(pre[1:tin.index(pre[0])+1], tin[:tin.index(pre[0])])
            root.right = self.reConstructBinaryTree(pre[tin.index(pre[0])+1:], tin[tin.index(pre[0])+1:])
        return root

if __name__ =='__main__':
    pre = [3, 9, 20, 15, 7]
    tin = [9, 3, 15, 20, 7]
    test = Solution()
    result = test.reConstructBinaryTree(pre, tin)
    prt = PrintTreeLayer()
    prt.printTreeLayer(result)


