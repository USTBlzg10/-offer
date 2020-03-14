class FindFirstCommonNode:
    def FindFirstCommonNode(self, pHead1, pHead2):
        l1 = self.getLength(pHead1)
        l2 = self.getLength(pHead2)
        if l1 > l2:
            self.walkSetp(pHead1, l1-l2)
        else:
            self.walkSetp(pHead2, l2-l1)
        while pHead1 != pHead2:
            pHead1 = pHead1.next
            pHead2 = pHead2.next
        return pHead1
    def getLength(self, head):
        length = 0
        while head:
            length += 1
            head = head.next
        return length
    def walkSetp(self, head, step):
        while step > 0:
            head = head.next
            step -= step
        return head