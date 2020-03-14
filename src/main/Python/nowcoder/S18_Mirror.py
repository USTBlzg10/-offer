from PrintTreeLayer import PrintTreeLayer
class Mirror:
    def Mirror(self, root):
        if root:
            node = root.left
            root.left = root.right
            root.right = node
            if root.left:
                self.Mirror(root.left)
            if root.right:
                self.Mirror(root.right)
        return root
if __name__ == '__main__':
    test = Mirror()
    array = [8, 6, 10, 5, 7, 9, 11]
    p = PrintTreeLayer()
    root = p.arrayToTree(array, 0)
    p.printTreeLayer(root)
    node = test.Mirror(root)
    print()
    p.printTreeLayer(node)