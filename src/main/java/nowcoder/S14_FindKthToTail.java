package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2019/12/25 19:07
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class S14_FindKthToTail {
    public ListNode findKthToTail(ListNode head, int k) {
        ListNode pre = head;
        ListNode last = head;
        if(head==null || k <=0)
            return null;
        for(int i=0;i <k-1;i++){ //使得pre和last的间距为k-1
            if(last.next!=null){
                last = last.next;
            }
            else
                return null;
        }
        while(last.next!=null){ //pre和last的间距为k-1，当last移动到最后一个节点时，pre就是倒数第k个
            pre = pre.next;
            last = last.next;
        }
        return pre;
    }
    public ListNode arrayToList(int[] array, int index){
        ListNode head = null;
        if (index < array.length){
            int value = array[index];
            head = new ListNode(value);
            head.next = arrayToList(array, index+1);
        }
        return head;
    }
    public static void main(String[] args){
        S14_FindKthToTail s14 = new S14_FindKthToTail();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        ListNode head = s14.arrayToList(array, 0);
        ListNode result = s14.findKthToTail(head, 3);
        if (result == null)
            System.out.print("null");
        else
            System.out.print(result.val);
    }
}
