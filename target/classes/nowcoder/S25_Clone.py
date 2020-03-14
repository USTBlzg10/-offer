class RandomListNode:
    def __init__(self, x):
        self.next = None
        self.random = None
        self.label = x
class Clone:
    def Clone(self, pHead):
        if not pHead:
            return None
        temp = pHead
        while temp:
            node = RandomListNode(temp.label)
            node.next = temp.next
            temp.next = node
            temp = node.next
        temp = pHead
        head = pHead.next
        while temp:
            if temp.next:
                temp.next.random = temp.random.next
            temp = temp.next.next
        #拆分
        temp1 = temp.next
        while temp:
            temp.next = temp1.next
            if temp.next:
                temp1.next = temp.next
            temp = temp.next
            temp1 = temp1.next
        return head