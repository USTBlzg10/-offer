package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2020/2/5 11:47
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树
 */
public class S39_IsBalanced {
    public boolean isBalanced(TreeNode root){
        if (root==null)
            return true;
        if (Math.abs(getDepth(root.left)-getDepth(root.right)) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int getDepth(TreeNode root){
        if(root == null)
            return 0;
        int ld = getDepth(root.left);
        int rd = getDepth(root.right);
        return ld > rd ? ld+1:rd+1;
    }
    public static void main(String[] args){
        S39_IsBalanced s39 = new S39_IsBalanced();
        PrintTreeLayer p = new PrintTreeLayer();
        Integer[] array = {1, 2, 3, 4, 5, null, null, 6};
        TreeNode root = p.arrayToTree(array, 0);
        System.out.println(s39.isBalanced(root));
    }
}
