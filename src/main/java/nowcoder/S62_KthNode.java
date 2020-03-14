package nowcoder;

import java.util.Stack;

/**
 * @author LiuZhiguo
 * @date 2020/2/17 21:50
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）中，
 * 按结点数值大小顺序第三小结点的值为4。
 */
public class S62_KthNode {
    int count = 0;
    public TreeNode KthNode(TreeNode pRoot, int k){
        if (pRoot == null || count > k)
            return null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = pRoot;
        TreeNode result = null;
        while (!stack.isEmpty() || p != null){
            while (p != null){
                stack.add(p);
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
    public static void main(String[] args){
        S62_KthNode s62 = new S62_KthNode();
        Integer[] array = {5, 3, 7, 2, 4, 6, 8};
        PrintTreeLayer p = new PrintTreeLayer();
        TreeNode root = p.arrayToTree(array, 0);
        System.out.println(s62.KthNode(root, 3).val);
    }
}
