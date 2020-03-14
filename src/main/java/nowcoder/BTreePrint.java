package nowcoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推
 */
public class BTreePrint {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if (pRoot != null) {
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            Stack<Integer> stack = new Stack<Integer>();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            queue.add(pRoot);
            stack.push(pRoot.val);
            int count=0;int levelcount =1; int level=0;
            while (!queue.isEmpty()) { //队列不空，做循环
                //ArrayList<Integer> temp = new ArrayList<Integer>();
                TreeNode out = queue.poll();
                count++;
                if (level %2==1) //偶数层
                    temp.add(stack.pop());
                else temp.add(out.val);
                if (out.left != null) {
                    if (level %2 ==0)
                        stack.push(out.left.val);
                    queue.add(out.left); //左孩子进队
                }
                if (out.right != null) {
                    if (level %2 ==0)
                        stack.push(out.right.val);
                    queue.add(out.right); //右孩子进队
                }
                if (count == levelcount){
                    levelcount = queue.size();
                    level++;
                    count = 0;
                    list.add(temp);
                    temp=new ArrayList<Integer>();
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        BTreePrint bTreePrint = new BTreePrint();
        Integer[] arr = new Integer[]{8,6,10,5,7,9,11,3,4,5,6,7,8,9,10};
        TreeNode root = LevelPrint.createBinaryTreeByArray(arr,0);
        System.out.println(bTreePrint.Print(root));
    }
}
