package nowcoder;

//递归的方法
public class DeleteDuplicationRecursion {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead==null||pHead.next==null)
            return pHead;
        ListNode current;
        if (pHead.val == pHead.next.val) {
            current = pHead.next.next;
            while (current != null && pHead.val==current.val)
                current = current.next;
            return deleteDuplication(current);
        }
        else {
            current = pHead.next;
            pHead.next = deleteDuplication(current);
            return pHead;
        }
    }
    public static void main(String[] args) {
        DeleteDuplicationRecursion deleteDuplicationRecursion = new DeleteDuplicationRecursion();
        ListNode head = new ListNode(1);
        ListNode a = new ListNode(2);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(3);
        head.next = a; a.next = b; b.next = c; c.next = d; d.next = e; e.next =f;
        System.out.println(deleteDuplicationRecursion.deleteDuplication(head));
    }
}
