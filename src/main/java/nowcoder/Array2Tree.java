/*
package nowcoder;

*/
/**
 * @author LiuZhiguo
 * @date 2019/12/18 19:21
 *//*

public class Array2Tree {
    public TreeNode arrayToTree(int[] arr, int index){
        TreeNode root = null;
        if (index < arr.length) {
            Integer value = arr[index];
            if (value == null) return null;
            root.left = arrayToTree(arr, 2*index +1);
            root.right = arrayToTree(arr, 2*index+2);
            return root;
        }
        return root;
    }
    public static void printTreeMidOrder(TreeNode root){
        if (root == null) return;
        if (root.left != null) printTreeMidOrder(root.left);
        //遍历root结点
        System.out.print(root.val+" ");
        if (root.right != null) printTreeMidOrder(root.right);
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        TreeNode root;
        root = arrayToTree(arr, 0);

    }
}
*/
