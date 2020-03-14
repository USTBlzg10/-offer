package nowcoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author LiuZhiguo
 * @date 2020/2/14 21:16
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class S59_ZPrint {
    public ArrayList<ArrayList<Integer>> ZPrint(TreeNode root){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if (root == null)
            return list;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int layer = 1;
        int layerCount = 1;
        int count = 0;
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode out = queue.poll();
            count++;
            if (out.left != null){
                queue.offer(out.left);
            }
            if (out.right != null){
                queue.offer(out.right);
            }
            //奇数层
            if (layer %2 == 1){
                list1.add(out.val);
                if (list1.size() == layerCount){
                    list.add(list1);
                    list1 = new ArrayList<Integer>();
                }
            }
            else {
                //偶数层先进栈
                stack.push(out);
                //若栈中的个数==layerCount，则弹出到list2
                if (stack.size() == layerCount){
                    while (!stack.isEmpty())
                        list2.add(stack.pop().val);
                    list.add(list2);
                    list2 = new ArrayList<Integer>();
                }
            }
            if (count == layerCount){
                layer++;
                layerCount = queue.size();
                count = 0;
            }
        }
        return list;
    }
    public static void main(String[] args){
        S59_ZPrint s59 = new S59_ZPrint();
        PrintTreeLayer p = new PrintTreeLayer();
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        TreeNode root = p.arrayToTree(array, 0);
        System.out.println(s59.ZPrint(root));
    }
}
