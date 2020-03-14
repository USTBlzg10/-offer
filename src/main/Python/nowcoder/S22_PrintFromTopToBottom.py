import queue
from PrintTreeLayer import PrintTreeLayer
class PrintFromTopToBottom:
    def printFromTopToBottom(self, root):
        if not root:
            return None
        que = queue.Queue()
        que.put(root)
        list = []
        while que.qsize() != 0:
            out = que.get()
            list.append(out.val)
            if out.left: que.put(out.left)
            if out.right: que.put(out.right)
        return list
if __name__ == '__main__':
    test = PrintFromTopToBottom()
    array = [1, 2, 3, 9, 8, 7, 6, 5, 4]
    p = PrintTreeLayer()
    root = p.arrayToTree(array, 0)
    print(test.printFromTopToBottom(root))