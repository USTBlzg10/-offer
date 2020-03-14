package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2020/2/2 19:14
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class S36_FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2){
        int l1 = getLength(pHead1);
        int l2 = getLength(pHead2);
        int step = 0;
        if (l1 > l2){
            step = l1 - l2;
            pHead1 = walkStep(pHead1, step);
        }
        else {
            step = l2 - l1;
            pHead2 = walkStep(pHead2 ,step);
        }
        while (pHead1 !=null && pHead2 != null){
            if (pHead1 == pHead2)
                return pHead1;
            else {
                pHead1 = pHead1.next;
                pHead2 = pHead2.next;
            }
        }
        return null;
    }
    //获取链表长度
    private int getLength(ListNode head){
        int length = 0;
        while (head != null){
            length++;
            head = head.next;
        }
        return length;
    }
    private ListNode walkStep(ListNode head, int step){
        while (step-- > 0){
            head = head.next;
        }
        return head;
    }
}
