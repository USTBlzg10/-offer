package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2019/12/13 19:20
 */
public class S4_ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in){
        TreeNode root = reConstruct(pre, 0, pre.length-1, in, 0, in.length-1);
        return root;
    }
    private TreeNode reConstruct(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd){
        if (preStart > preEnd || inStart > inEnd)
            return null;
        TreeNode root = new TreeNode(pre[preStart]); //前序第一个即是根节点
        for (int i=inStart;i<=inEnd;i++){
            if (in[i] == pre[preStart]){
                root.left = reConstruct(pre, preStart+1, preStart+i-inStart, in, inStart,i-1);
                root.right = reConstruct(pre, preStart+i-inStart+1, preEnd, in, i+1, inEnd);
                break;
            }
        }
        return root;
    }
    public static void main(String[] args){
        S4_ReConstructBinaryTree s4 = new S4_ReConstructBinaryTree();
        int[] pre = {3, 9, 20, 15, 7};
        int[] in = {9, 3, 15, 20, 7};
        TreeNode root = s4.reConstructBinaryTree(pre, in);
        PrintTreeLayer p = new PrintTreeLayer();
        p.printTreeLayer(root);
    }
}
