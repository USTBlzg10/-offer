from PrintTreeLayer import PrintTreeLayer
class HasSubTree:
    def HasSubTree(self, root1, root2):
        def convert(p):
            if p:
                return str(p.val) + convert(p.left) + convert(p.right)
            else:
                return " "
        return convert(root2) in convert(root1) if root2 else False
if __name__ == '__main__':
    test = HasSubTree()
    p = PrintTreeLayer()
    array1 = [8, 9, 2, 1, 3, 4, None]
    array2 = [1]
    root1 = p.arrayToTree(array1, 0)
    root2 = p.arrayToTree(array2, 0)
    result = test.HasSubTree(root1, root2)
    print(result)
