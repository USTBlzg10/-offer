package nowcoder;

class ListNode{
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1 = getLength(pHead1);
        int len2 = getLength(pHead2);
        if (len1 > len2){
            pHead1 = walkStep(pHead1, len1-len2);
        }
        else
            pHead2 = walkStep(pHead2, len2-len1);
        while(pHead1 != pHead2) {
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;
    }
    ListNode walkStep(ListNode head, int step){
        while (step-- > 0)
            head = head.next;
        return head;
    }
    public int getLength(ListNode a) {
        int length = 0;
        while(a != null) {
            length++;
            a = a.next;
        }
        return length;
    }
}
/*
public class FindFirstCommonNode {
    class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {

            this.val = val;
        }
    }
    public ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1 = findListLength(pHead1);
        int len2 = findListLength(pHead2);
        if (len1>len2){
            pHead1 = walkStep(pHead1, len1-len2);
        }
        else
            pHead2 = walkStep(pHead2, len2-len1);
        while (pHead1 !=null) {
            if (pHead1 ==pHead2)
                return pHead1;
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return null;
    }
    int findListLength(ListNode head) {
        if (head == null)
            return 0;
        int sum = 1;
        while ((head = head.next) != null)
            ++sum;
        return sum;
    }
    ListNode walkStep(ListNode pHead1, int step){
        while(step-- >=0){
            pHead1 = pHead1.next;
        }
        return pHead1;
    }
    ListNode head;
    public void addNode(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    */
/*public static void main(String[] args) {
        ListNode node1 =new ListN;
        MyListNode node2 = new MyListNode(0);
        node1.addNode(1);
        node1.addNode(2);
        node1.addNode(3);
        node1.addNode(4);
        node2.addNode(0);
        node2.addNode(2);
        node2.addNode(3);
        FindFirstCommonNode findFirstCommonNode = new FindFirstCommonNode();
        ListNode res = findFirstCommonNode.findFirstCommonNode(node1, node2);
        System.out.println(res.val);
    }*//*


}
*/
