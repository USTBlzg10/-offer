import queue
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
class PrintTreeLayer:
    def printTreeLayer(self, root):
        depth = self.getDepth(root)
        que = queue.Queue()
        if root is None:
            return None
        que.put(root)
        count = 0
        currentDepth = 0
        beforeCount = 1
        p = TreeNode(-1)
        while que.qsize() > 0:
            out = que.get()
            count += 1
            if out.val == -1:
                print("null", end=" ")
            else:
                print(out.val, end=" ")
            if out.left:
                que.put(out.left)
            elif currentDepth < depth-1:
                que.put(p)
            if out.right:
                que.put(out.right)
            elif currentDepth < depth-1:
                que.put(p)
            if count == beforeCount:
                beforeCount = que.qsize()
                currentDepth += 1
                count = 0


    def arrayToTree(self, array, index):
        root = None
        if index < len(array):
            value = array[index]
            if value is None:
                return None
            root = TreeNode(value)
            root.left = self.arrayToTree(array, index*2+1)
            root.right = self.arrayToTree(array, index*2+2)
            return root
        return root
    def getDepth(self,root):
        if root is None:
            return 0
        ld = self.getDepth(root.left)
        rd = self.getDepth(root.right)
        return max(ld, rd)+1
if __name__ == '__main__':
    test = PrintTreeLayer()
    array = [3, 9, 20, None, None, 15, 7]
    root = test.arrayToTree(array, 0) #转换成了一棵二叉树
    test.printTreeLayer(root)

