package nowcoder;

import java.util.Stack;

/**
 * @author LiuZhiguo
 * @date 2019/12/25 20:25
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class S15_ReverseList {
    public ListNode reverseList(ListNode head){
        //利用头插法
        ListNode pre = head;
        ListNode p, q;
        if (head == null)
            return null;
        p = pre.next;
        pre.next = null;
        while (p !=null){
            q = p.next;
            p.next = pre;
            pre = p;
            p = q;
        }
        //利用栈
        /*Stack<ListNode> stack = new Stack<ListNode>();
        ListNode p = head;
        while (p.next != null){
            stack.push(p);
            p = p.next;
        }
        ListNode q = p; //最后一个节点
        while (!stack.isEmpty()){
            q.next = stack.pop();
            q = q.next;
        }*/
        return pre;
    }
    public static void main(String[] args){
        S15_ReverseList s15 = new S15_ReverseList();
        S14_FindKthToTail s14 = new S14_FindKthToTail();
        int[] array = {1,2,3,4,5,6,7,8,10};
        ListNode head = s14.arrayToList(array, 0);
        ListNode result = s15.reverseList(head);
        if (result == null)
            System.out.print("null");
        else
            System.out.print(result.next.next.val);
    }
}
