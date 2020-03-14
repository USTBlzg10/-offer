import Array2List
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
class DeleteDuplicatioin:
    def deleteDuplication(self, pHead):
        # write code here
        if pHead == None or pHead.next == None:
            return pHead
        new_head = ListNode(-1)
        new_head.next = pHead
        pre = new_head
        p = pHead
        nex = None
        while p != None and p.next != None:
            nex = p.next
            if p.val == nex.val:
                while nex != None and nex.val == p.val:
                    nex = nex.next
                pre.next = nex
                p = nex
            else:
                pre = p
                p = p.next
        return new_head.next
if __name__ == '__main__':
    test = DeleteDuplicatioin()
    array2List = Array2List.Array2List()
    array = [1, 2, 3, 3, 4, 4, 5]
    pHead = array2List.array2List(array)
    pHead = test.deleteDuplication(pHead)
    while pHead:
        print(pHead.val)
        pHead = pHead.next