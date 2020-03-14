package leetcodeTest.JavaVersion;

import nowcoder.PrintTreeLayer;
import nowcoder.TreeNode;
import scala.Int;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author LiuZhiguo
 * @date 2019/12/23 19:39
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,2,3]
 */

public class S144_PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        List<Integer> list =new ArrayList<Integer>();
        while (!stack.isEmpty()) {
            TreeNode out = stack.pop();
            list.add(out.val);
            if (out.right != null) stack.push(out.right);
            if (out.left != null) stack.push(out.left);
        }
        return list;
    }
    public static void main(String[] args){
        S144_PreorderTraversal s144 = new S144_PreorderTraversal();
        PrintTreeLayer p = new PrintTreeLayer();
        Integer[] array = {1, null, 2,null,null, 3, 4};
        TreeNode root = p.arrayToTree(array, 0);
        System.out.print(s144.preorderTraversal(root));
    }
}
