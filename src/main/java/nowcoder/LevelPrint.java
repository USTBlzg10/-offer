package nowcoder;
/**
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class LevelPrint {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null) return list;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(pRoot);
        int count=0;
        int levelCount=1;
        while (!queue.isEmpty()) {
            TreeNode out = queue.poll();
            count++;
            temp.add(out.val);
            if (out.left != null) {
                queue.add(out.left);
            }
            if (out.right != null) {
                queue.add(out.right);
            }
            if (count == levelCount) {
                levelCount=queue.size();
                count = 0;
                list.add(temp);
                temp = new ArrayList<Integer>();
            }
        }
        return list;
    }
    public static TreeNode createBinaryTreeByArray(Integer []array,int index) {
        TreeNode tn = null;
        if (index<array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            tn = new TreeNode(value);
            tn.left = createBinaryTreeByArray(array, 2*index+1);
            tn.right = createBinaryTreeByArray(array, 2*index+2);
            return tn;
        }
        return tn;
    }
    public static void main(String[] args) {
        LevelPrint levelPrint = new LevelPrint();
        Integer[] arr = new Integer[]{8,6,10,5,7,9,11};
        TreeNode root = createBinaryTreeByArray(arr,0);
        System.out.println(levelPrint.Print(root));
    }
}
