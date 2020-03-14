class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
class Array2List:
    def array2List(self, array):
        if not array:
            return None
        head = ListNode(array[0])
        p = head
        for i in range(1, len(array)):
            node = ListNode(array[i])
            p.next = node
            p = p.next
        return head
if __name__ == '__main__':
    test = Array2List()
    array = [1, 2, 3, 4, 5]
    head = test.array2List(array)
    while head:
        print(head.val)
        head = head.next