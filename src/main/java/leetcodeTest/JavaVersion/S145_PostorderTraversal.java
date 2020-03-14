package leetcodeTest.JavaVersion;

import nowcoder.PrintTreeLayer;
import nowcoder.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author LiuZhiguo
 * @date 2019/12/23 20:17
 */
public class S145_PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (cur == null) {
                continue;
            }
            stack1.push(cur);
            stack.push(cur.left);
            stack.push(cur.right);
        }
        while (!stack1.isEmpty()){
            TreeNode out = stack1.pop();
            list.add(out.val);
        }
        return list;
    }
    public static void main(String[] args){
        S145_PostorderTraversal s145 = new S145_PostorderTraversal();
        PrintTreeLayer p = new PrintTreeLayer();
        Integer[] array = {3,1,2};
        TreeNode root = p.arrayToTree(array, 0);
        System.out.print(s145.postorderTraversal(root));
        //p.printTreeLayer(root);
    }
}
