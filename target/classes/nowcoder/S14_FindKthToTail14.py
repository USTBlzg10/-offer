class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
class FindKthToTail:
    def findKthToTail(self, head, k):
        tail = pre = head
        for _ in range(k):
            if not tail:
                return None
            tail = tail.next
        while tail:
            pre = pre.next
            tail = tail.next
        return pre
    def arrayToList(self, array, index):
        head = None
        if index < len(array):
            value = array[index]
            head = ListNode(value)
            head.next = self.arrayToList(array, index+1)
        return head

if __name__ == '__main__':
    test = FindKthToTail()
    array = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    head = test.arrayToList(array, 0)
    result = test.findKthToTail(head, 1)
    if result:
        print(result.val)
    else:print("null")