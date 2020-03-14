package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2019/12/26 19:37
 */
public class ListToArray {
    public int[] listToArray(ListNode head){
        int length = 0;
        ListNode pre = head;
        while (head!=null){
            length++;
            head = head.next;
        }
        int[] array = new int[length];
        for (int i=0;i<length;i++){
            array[i] = pre.val;
            pre = pre.next;
        }
        return array;
    }
}
