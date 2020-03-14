import PrintTreeLayer
class TreeDepth:
    def TreeDepth(self, root):
        ld = self.TreeDepth(root.left)
        rd = self.TreeDepth(root.right)
        if ld > rd:
            return ld +1
        else: return rd +1

if __name__ == '__main__':
    test = TreeDepth()
    p = PrintTreeLayer.PrintTreeLayer()
    array = [1, 2, 3, 4, 5, 6, 7, 8]
    root = p.arrayToTree(array, 0)
    print(test.TreeDepth(root))