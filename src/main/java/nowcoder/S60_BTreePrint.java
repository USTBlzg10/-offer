package nowcoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author LiuZhiguo
 * @date 2020/2/15 11:05
 */
public class S60_BTreePrint {
    public ArrayList<ArrayList<Integer>> print(TreeNode root){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if (root == null)
            return list;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int layerCount = 1;
        int layer = 1;
        int count = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        while (!queue.isEmpty()){
            TreeNode out = queue.poll();
            count++;
            temp.add(out.val);
            if (out.left != null)
                queue.offer(out.left);
            if (out.right != null)
                queue.offer(out.right);
            if (count == layerCount){
                layer++;
                layerCount = queue.size();
                count = 0;
                list.add(temp);
                temp = new ArrayList<Integer>();
            }
        }
        return list;
    }
    public static void main(String[] args){
        S60_BTreePrint s60 = new S60_BTreePrint();
        PrintTreeLayer p = new PrintTreeLayer();
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        TreeNode root = p.arrayToTree(array, 0);
        System.out.println(s60.print(root));
    }
}
