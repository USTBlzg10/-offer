package nowcoder;
/**
 * @author LiuZhiguo
 * @date 2020/2/14 13:10
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;
    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class S57_GetNext {
    public TreeLinkNode getNext(TreeLinkNode pNode){
        TreeLinkNode node;
        if (pNode == null)
            return null;
        if (pNode.right != null){
            pNode = pNode.right;
            while (pNode.left != null)
                pNode = pNode.left;
            return pNode;
        }
        while (pNode.next != null){
            node = pNode.next;
            if (pNode == node.left)
                return node;
            else
                pNode = node;
        }
        return null;
    }
}
