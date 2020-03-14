package nowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author LiuZhiguo
 * @date 2019/12/31 23:43
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 */
public class S24_FindPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> paths=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> path = new ArrayList<Integer>();
        if(root==null)return paths;
        find(paths,path,root,target);
        Collections.sort(paths, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                if (o1.size() < o2.size())
                    return 1;
                else return -1;
            }
        });
        return paths;
    }
    public void find(ArrayList<ArrayList<Integer>> paths,ArrayList<Integer> path,TreeNode root,int target){
        path.add(root.val);
        if(root.left == null && root.right==null){
            if(target == root.val){
                paths.add(path);
            }
            return;
        }
        ArrayList<Integer> path2 = new ArrayList<Integer>();
        path2.addAll(path);
        if(root.left!=null)find(paths, path, root.left,target-root.val);
        if(root.right!=null)find(paths, path2, root.right,target-root.val);
    }
    public static void main(String[] args){
        S24_FindPath s24 = new S24_FindPath();
        PrintTreeLayer p = new PrintTreeLayer();
        Integer[] array = {1, 2, 3, 12, 5, 6, 7, null, null,2,4,5};
        TreeNode root = p.arrayToTree(array, 0);
        System.out.println(s24.FindPath(root, 15));
    }
}
