from S14_FindKthToTail14 import FindKthToTail
class ReverseList:
    def reverseList(self, pHead):
        if not pHead or not pHead.next:
            return pHead
        p = pHead.next
        pHead.next = None
        while p:
            p1 = p.next
            p.next = pHead
            pHead = p
            p = p1
        return pHead

if __name__ == '__main__':
    test = ReverseList()
    test14 = FindKthToTail()
    array = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    head = test14.arrayToList(array, 0)
    print(test.reverseList(head).val)
