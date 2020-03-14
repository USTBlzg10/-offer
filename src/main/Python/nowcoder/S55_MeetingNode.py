class MeetingNode:
    def meetingNode(self, pHead):
        if not pHead or not pHead.next:
            return None
        fast = pHead
        slow = pHead
        while fast and slow:
            fast = fast.next.next
            slow = slow.next
            if fast == slow:
                break
        slow = pHead
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow