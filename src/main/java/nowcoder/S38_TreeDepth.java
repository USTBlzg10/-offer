package nowcoder;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author LiuZhiguo
 * @date 2020/2/4 14:28
 */
public class S38_TreeDepth {
    //递归方法
    /*public int TreeDepth(TreeNode root){
        if (root == null)
            return 0;
        int ld = TreeDepth(root.left);
        int rd = TreeDepth(root.right);
        return ld > rd ? ld+1 : rd+1;
    }*/
    //非递归方法，层次遍历
    public int TreeDepth(TreeNode root){
        if (root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int depth = 0;
        int count = 0;
        int layerCount = 1;
        queue.offer(root);
        TreeNode out;
        while (!queue.isEmpty()){
            out = queue.poll();
            count++;
            if (out.left != null)
                queue.offer(out.left);
            if (out.right != null)
                queue.offer(out.right);
            if (count == layerCount){
                depth++;
                layerCount = queue.size();
                count = 0;
            }
        }
        return depth;
    }
    public static void main(String[] args){
        S38_TreeDepth s38 = new S38_TreeDepth();
        PrintTreeLayer pt = new PrintTreeLayer();
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        TreeNode root = pt.arrayToTree(array, 0);
        System.out.println(s38.TreeDepth(root));
    }
}
