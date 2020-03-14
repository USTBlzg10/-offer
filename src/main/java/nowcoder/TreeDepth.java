package nowcoder;

import java.util.LinkedList;
import java.util.Queue;

//方法一，采用递归的方法
/*public class TreeDepth {
    public int TreeDepth(TreeNode root)
    {
        if(root == null){
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left, right) + 1;
    }
}*/
//方法二，采用非递归的方法
public class TreeDepth {
    public int TreeDepth(TreeNode root){
        if (root == null) return 0;
        /*Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int depth = 0; int count = 0;
        int beforeCount =1; //用来统计上一层的节点个数
        while (!queue.isEmpty()) {
            TreeNode out = queue.poll();
            count++;
            if (out.left != null) queue.add(out.left);
            if (out.right != null) queue.add(out.right);
            if (count == beforeCount) {
                beforeCount = queue.size();
                depth++;
                count =0;
            }
        }*/
        int ld = TreeDepth(root.left);
        int rd = TreeDepth(root.right);
        return ld>rd?(ld+1):(rd+1);
        //return depth;
    }
    public static void main(String[] args){
        TreeDepth treeDepth = new TreeDepth();
        Integer[] arr = {1, 2, 3, null, 5, 6, 7};
        PrintTreeLayer p = new PrintTreeLayer();
        TreeNode root = p.arrayToTree(arr, 0);
        System.out.println(treeDepth.TreeDepth(root));
    }
}
