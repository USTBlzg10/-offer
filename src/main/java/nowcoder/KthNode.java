package nowcoder;

import java.util.Stack;

/**
 *给定一棵二叉搜索树，请找出其中的第k小的结点。
 * 例如，（5，3，7，2，4，6，8）中，按结点数值大小顺序第三小结点的值为4。
 */
public class KthNode {
    int count = 0;
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null || count >k)
            return null;
        TreeNode p = pRoot;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode result = null;
        while (!stack.isEmpty() || p != null) {
            while (p !=null) {
                stack.push(p);
                p = p.left;
            }
            TreeNode node = stack.pop();
            count++;
            if (count == k)
                result = node;
            p = node.right;
        }
        return result;
    }
}
