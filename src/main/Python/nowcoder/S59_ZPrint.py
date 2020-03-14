import PrintTreeLayer
class ZPrint:
    def Print(self, pRoot):
        if not pRoot:
            return []
        nodeStack = [pRoot]
        result = []
        while nodeStack:
            res = []
            nextStack = []
            for i in nodeStack:
                res.append(i.val)
                if i.left:
                    nextStack.append(i.left)
                if i.right:
                    nextStack.append(i.right)
            nodeStack = nextStack
            result.append(res)
        returnResult = []
        for i, v in enumerate(result):
            if i % 2 == 0:
                returnResult.append(v)
            else:
                returnResult.append(v[::-1])
        return returnResult
if __name__ == '__main__':
    test = ZPrint()
    p = PrintTreeLayer.PrintTreeLayer()
    array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
    root = p.arrayToTree(array, 0)
    print(test.Print(root))