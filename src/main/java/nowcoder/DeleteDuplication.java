package nowcoder;

public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead==null||pHead.next==null) return pHead;
        else {
            //新建一个节点，防止头结点要被删除
            ListNode newHead=new ListNode(-1);
            newHead.next=pHead;
            ListNode pre=newHead;
            ListNode p=pHead;
            ListNode next=null;
            while(p!=null && p.next!=null)
            {
                next=p.next;
                if(p.val==next.val)//如果当前节点的值和下一个节点的值相等
                {
                    while(next!=null && next.val==p.val)//向后重复查找
                        next=next.next;
                    pre.next=next;//指针赋值，就相当于删除
                    p=next;
                }
                else{ //如果当前节点和下一个节点值不等，则向后移动一位
                    pre=p;
                    p=p.next;
                }
            }
            return newHead.next;//返回头结点的下一个节点
        }
    }
}
