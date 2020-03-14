package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2020/1/6 16:53
 */
class RandomListNode{
    int label;
    RandomListNode next = null;
    RandomListNode random = null;
    RandomListNode(int label){
        this.label = label;
    }
}

public class S25_Clone {
    public RandomListNode Clone(RandomListNode pHead){
        if (pHead == null) return null;
        RandomListNode temp = pHead;
        //1.遍历整个链表，复制每个节点，比如复制A节点得到A’，并把A’链接到A的后面
        while (temp != null){
            RandomListNode node = new RandomListNode(temp.label);
            node.next = temp.next;
            temp.next = node;
            temp = node.next;
        }
        //2.再次遍历链表，复制老节点的随机指针给新节点，如A’.random = A.random.next
        temp = pHead;
        RandomListNode head = pHead.next;
        while (temp != null){
            if (temp.random != null)
                temp.next.random = temp.random.next;
            temp = temp.next.next;
        }
        //3.拆分整链表，拆分成原链表和新链表
        temp = pHead;
        RandomListNode temp1 = temp.next;
        while (temp != null){
            temp.next = temp1.next;
            if (temp.next != null)
                temp1.next = temp.next.next;
            temp = temp.next;
            temp1 = temp1.next;
        }
        return head;
    }
}
