package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2020/2/13 21:35
 */
public class S55_MeetingNode {
    public ListNode meetingNode(ListNode pHead){
        if (pHead == null || pHead.next == null)
            return null;
        ListNode slow = pHead;
        ListNode fast = pHead;
        while (slow != null && fast != null){
            slow = slow.next; //走一步
            fast = fast.next.next; //走两步
            if (slow == fast)
                break;
        }
        slow = pHead;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
