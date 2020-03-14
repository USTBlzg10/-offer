package nowcoder;

import java.util.Stack;

/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class BTreeIsSymmetricalNonRecursion {
    boolean isSymmetrical(TreeNode pRode) {
        if (pRode == null)
            return true;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(pRode.left);
        stack.push(pRode.right);
        while (!stack.isEmpty()) {
            TreeNode p = stack.pop();//右孩子
            TreeNode q = stack.pop();//左孩子
            if (p == null && q == null) continue;
            if (p == null || q == null) return false;
            if (p.val != q.val) return false;
            stack.push(p.right);
            stack.push(q.left);
            stack.push(p.left);
            stack.push(q.right);
        }
        return true;
    }
}
