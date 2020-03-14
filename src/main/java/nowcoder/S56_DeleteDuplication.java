package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2020/2/13 22:52
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class S56_DeleteDuplication {
    public static ListNode deleteDuplication(ListNode pHead) {
        ListNode first = new ListNode(-1);//设置一个trick
        first.next = pHead;
        ListNode p = pHead;
        ListNode last = first;
        while (p != null && p.next != null) {
            if (p.val == p.next.val) {
                int val = p.val;
                p = p.next;
                while (p!= null&&p.val == val)
                    p = p.next;
                last.next = p;
            } else {
                last = p;
                p = p.next;
            }
        }
        return first.next;
    }
    public static void main(String[] args){
        S56_DeleteDuplication s56 = new S56_DeleteDuplication();
        int[] array = {1, 2, 3, 3, 4, 4, 5};
        Array2List array2List = new Array2List();
        ListNode head = array2List.array2List(array);
        head = s56.deleteDuplication(head);
        while (head != null){
            System.out.print(head.val+"->");
            head = head.next;
        }
    }
}