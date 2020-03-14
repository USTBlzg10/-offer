package leetcodeTest.JavaVersion;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class AddTowNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        ListNode result = new ListNode(0);
        ListNode cur = result;
        int carry = 0;
        while(l1 != null || l2 != null){
            int x = (l1 != null)? l1.val : 0;
            int y = (l2 != null)? l2.val : 0;
            sum = x+y+carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0 )
            cur.next = new ListNode(carry);
        System.out.println(sum);
        return result.next;
    }
    public static void main(String[] args){
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(2);
        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(1);
        AddTowNumbers addTowNumbers = new AddTowNumbers();
        ListNode res = addTowNumbers.addTwoNumbers(l1 , l2);
        //System.out.println(res.next.val);
    }
}
