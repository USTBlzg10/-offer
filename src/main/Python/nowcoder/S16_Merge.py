from S14_FindKthToTail14 import ListNode
from S14_FindKthToTail14 import FindKthToTail
class Merge:
    def merge(self, list1, list2):
        r = head = ListNode(-1)
        while list1 and list2:
            if list1.val <= list2.val:
                r.next = list1
                list1 = list1.next
            else:
                r.next = list2
                list2 = list2.next
            r = r.next
        r.next = list1 or list2
        return head.next
if __name__ == '__main__':
    test = Merge()
    s14 = FindKthToTail()
    array1 = [1, 3, 5, 7, 9]
    array2 = [2, 4, 6, 8, 10]
    list2 = s14.arrayToList(array2, 0)
    list1 = s14.arrayToList(array1, 0)
    head = test.merge(list1, list2)
    while head:
        print(head.val, end=" ")
        head = head.next