package nowcoder;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author LiuZhiguo
 * @date 2019/6/23 19:53
 */
public class S3_PrintListFromTailToHead {
    ListNode initList(int[] data){
        if (data.length == 0)
            return null;
        ListNode head = new ListNode(data[0]);
        ListNode r = head;
        for (int i=1;i<data.length;i++){
            ListNode node = new ListNode(data[i]);
            r.next = node;
            r = r.next;
        }
        return head;
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode ln = listNode;
        while (ln != null){
            stack.push(ln.val);
            ln = ln.next;
        }
        while (!stack.isEmpty())
            list.add(stack.pop());
        return list;
    }
    public static void main(String[] args){
        S3_PrintListFromTailToHead s3_printListFromTailToHead = new S3_PrintListFromTailToHead();
        int[] array = {1, 2, 3, 4, 5};
        ListNode list = s3_printListFromTailToHead.initList(array);
        System.out.println(s3_printListFromTailToHead.printListFromTailToHead(list));
    }
}
