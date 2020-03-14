class TreeLinkNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
        self.next = None
class GetNext:
    def getNext(self, pNode):
        node = pNode
        while node.next:
            node = node.next
        self.result = []
        self.midTraversal(node)
        return self.result[self.result.index(pNode)+1] if self.result.index(pNode) != len(self.result) -1 else None
    def midTraversal(self, node):
        if not node:
            return
        self.midTraversal(node.left)
        self.result.append(node)
        self.midTraversal(node.right)