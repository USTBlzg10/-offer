package nowcoder;

import java.util.Stack;

/**
 * @author LiuZhiguo
 * @date 2020/2/14 19:09
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class S58_IsSymmetrical {
    public boolean isSymmetrical(TreeNode pNode){
        if (pNode == null)
            return true;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(pNode.left);
        stack.push(pNode.right);
        while (!stack.empty()){
            TreeNode p = stack.pop();//右孩子
            TreeNode q = stack.pop();//左孩子
            if (p == null && q == null)
                continue;
            if (p == null || q == null)
                return false;
            if (p.val != q.val)
                return false;
            stack.push(q.left);
            stack.push(p.right);
            stack.push(q.right);
            stack.push(p.left);
        }
        return true;
    }
    public static void main(String[] args){
        S58_IsSymmetrical s58 = new S58_IsSymmetrical();
        PrintTreeLayer p = new PrintTreeLayer();
        Integer[] array = {1, 2, 2, 3, 4, 4, 5};
        TreeNode root = p.arrayToTree(array, 0);
        System.out.println(s58.isSymmetrical(root));
    }
}
