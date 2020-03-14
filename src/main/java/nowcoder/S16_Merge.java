package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2019/12/26 19:24
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class S16_Merge {
    public ListNode merge(ListNode list1, ListNode list2){
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode head = new ListNode(-1); //创建一个头节点，最后返回其next
        ListNode rear = head;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                rear.next = list1;
                list1 = list1.next;
                rear = rear.next;
            }
            else {
                rear.next = list2;
                list2 = list2.next;
                rear = rear.next;
            }
        }
        if (list1 != null) rear.next = list1;
        if (list2 != null) rear.next = list2;
        return head.next;
    }
    public static void main(String[] args){
        S16_Merge s16 = new S16_Merge();
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};
        S14_FindKthToTail s14 = new S14_FindKthToTail();
        ListNode list1 = s14.arrayToList(array1, 0);
        ListNode list2 = s14.arrayToList(array2, 0);
        ListNode head = s16.merge(list1, list2);
        while (head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
}