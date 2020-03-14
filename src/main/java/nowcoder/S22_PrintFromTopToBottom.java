package nowcoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author LiuZhiguo
 * @date 2019/12/29 19:57
 */
public class S22_PrintFromTopToBottom {
    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null) return list;
        queue.offer(root);
        TreeNode out;
        while (!queue.isEmpty()) {
            out = queue.poll();
            list.add(out.val);
            if (out.left != null) queue.offer(out.left);
            if (out.right != null) queue.offer(out.right);
        }
        return list;
    }
    public static void main(String[] args){
        S22_PrintFromTopToBottom s22 = new S22_PrintFromTopToBottom();
        Integer[] array = {1, 2, 3, 9, 8, 7, 6, 5, 4};
        PrintTreeLayer p = new PrintTreeLayer();
        TreeNode root = p.arrayToTree(array, 0);
        System.out.println(s22.printFromTopToBottom(root));
    }
}
