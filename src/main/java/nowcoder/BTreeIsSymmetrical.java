package nowcoder;

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class BTreeIsSymmetrical {
    boolean isSymmetrical(TreeNode pRode) {
        if (pRode == null)
            return true;
        return symmetrical(pRode.left, pRode.right);
    }
    boolean symmetrical(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.val != right.val)
            return false;
        return symmetrical(left.left, right.right) && symmetrical(left.right, right.left);
    }
}
