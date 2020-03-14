package nowcoder;

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null
 */
//验证有环：
public class EntryNodeOfLoop_55 {
    public static ListNode meetingNode(ListNode pHead) {
        if (pHead == null || pHead.next == null)
            return null;
        ListNode slow = pHead.next;
        ListNode fast = slow.next;
        while (slow != null && fast == null) {
            if (fast == slow)
                return slow;
            slow = slow.next;
            fast = fast.next;
            if (fast != null)
                fast = fast.next;
        }
        return null;
    }
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode meetingNode = meetingNode(pHead);
        if (meetingNode == null)
            return null;
        ListNode p1 = meetingNode;
        int numberOfLoop = 1;
        //统计环中节点的个数
        while (p1.next != p1){
            ++numberOfLoop;
            p1 = p1.next;
        }
        p1 = pHead;
        for (int i=0;i<numberOfLoop;i++)
            p1 = p1.next;
        ListNode p2 = pHead;
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
    public static void main(String[] args) {
        EntryNodeOfLoop_55 entryNodeOfLoop_55 = new EntryNodeOfLoop_55();

    }
}
