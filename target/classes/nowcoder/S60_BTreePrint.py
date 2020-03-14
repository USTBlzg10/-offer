import PrintTreeLayer

class BTreePrint:
    def print(self, root):
        if not root:
            return []
        nodeQueue = [root]
        result = []
        while nodeQueue:
            res = []
            nextQueue = []
            for i in nodeQueue:
                res.append(i.val)
                if i.left:
                    nextQueue.append(i.left)
                if i.right:
                    nextQueue.append(i.right)
            nodeQueue = nextQueue
            result.append(res)
        return result
if __name__ == '__main__':
    test = BTreePrint()
    p = PrintTreeLayer.PrintTreeLayer()
    array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
    root = p.arrayToTree(array, 0)
    print(test.print(root))