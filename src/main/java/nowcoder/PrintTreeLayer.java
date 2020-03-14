package nowcoder;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author LiuZhiguo
 * @date 2019/12/18 21:09
 * 利用层次遍历逐行打印树的各结点的值
 */
public class PrintTreeLayer {
    public void printTreeLayer(TreeNode root){
        int depth = getDepth(root);
        if (root==null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //根结点进队
        queue.offer(root);
        int currentDepth = 0;//用来记录
        int count = 0;
        int beforeCount = 1;
        TreeNode p = new TreeNode(-1);
        while (!queue.isEmpty()) {
            TreeNode out = queue.poll();
            if (out.val == -1)
                System.out.print("null"+" ");
            else
                System.out.print(out.val+" ");
            count++;
            if (out.left != null)
                queue.add(out.left);
            else if (currentDepth < depth-1)
                queue.offer(p);
            if (out.right != null)
                queue.add(out.right);
            else if (currentDepth < depth-1)
                queue.offer(p);
            if (count == beforeCount) {
                beforeCount = queue.size();
                currentDepth ++;
                count =0;
            }
        }
    }
    public TreeNode arrayToTree(Integer[] array, int index){
        TreeNode root = null;
        if (index < array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            root = new TreeNode(value);
            root.left = arrayToTree(array, 2*index+1);
            root.right = arrayToTree(array, 2*index+2);
            return root;
        }
        return root;
    }
    private int getDepth(TreeNode root){
        if (root == null) return 0;
        int ld = getDepth(root.left);
        int rd = getDepth(root.right);
        return ld>rd?(ld+1):(rd+1);
    }
    public static void main(String[] args){
        PrintTreeLayer print = new PrintTreeLayer();
        Integer[] arr = {3, 9, 20, null, null, 15, 7};
        TreeNode root = print.arrayToTree(arr,0);
        print.printTreeLayer(root);
    }
}
