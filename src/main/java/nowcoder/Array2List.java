package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2020/2/13 23:02
 */
public class Array2List {
    public ListNode array2List(int[] array){
        if (array.length == 0)
            return null;
        ListNode head = new ListNode(array[0]);
        ListNode first = head;
        for (int i=1;i<array.length;i++){
            ListNode node = new ListNode(array[i]);
            head.next = node;
            head = head.next;
        }
        return first;
    }
    public static void main(String[] args){
        int[] array = {1, 2, 3, 3, 4, 4, 5};
        Array2List array2List = new Array2List();
        ListNode head = array2List.array2List(array);
        while (head != null){
            System.out.println(head.val + " ");
            head = head.next;
        }
    }
}
