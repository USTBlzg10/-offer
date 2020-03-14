class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
class Solution:
    # 将输入列表转换为链表
    def initList (self, data):
        # 判空
        if len(data) == 0:
            return
        else:
            # 创建头结点
            self.head = ListNode(data[0])
            r = self.head
            p = self.head
            # 逐个为 data内的数据创建节点，建立链表
            for i in data[1:]:
                node = ListNode(i)
                p.next = node
                p = p.next
            return r
    def printListFromTailToHead(self, listNode):
        l = []
        head = listNode
        while head:
            l.insert(0, head.val)
            head = head.next
        return l
if __name__ == '__main__':
    test = Solution()
    data = [1, 2, 3, 4, 5]
    l1 = test.initList(data)
    print(test.printListFromTailToHead(l1))