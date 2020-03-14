package nowcoder;

/**
 *
 * @author LiuZhiguo
 * @date 2019/12/26 21:59
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 二叉树的镜像定义：源二叉树
 *     	    8
 *     	   /  \
 *     	  6   10
 *     	 / \  / \
 *     	5  7 9 11
 *     	镜像二叉树
 *     	    8
 *     	   /  \
 *     	  10   6
 *     	 / \  / \
 *     	11 9 7  5
 */
public class S18_Mirror {
    public TreeNode Mirror(TreeNode root){
        TreeNode temp = null;
        if (root != null){
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            if (root.left != null)
                Mirror(root.left);
            if (root.right != null)
                Mirror(root.right);
        }
        return root;
    }
    public static void main(String[] args){
        S18_Mirror s18 = new S18_Mirror();
        Integer[] array = {8, 6, 10, 5, 7, 9, 11};
        PrintTreeLayer p = new PrintTreeLayer();
        TreeNode root = p.arrayToTree(array, 0);
        p.printTreeLayer(root);
        System.out.println();
        p.printTreeLayer(s18.Mirror(root));
    }
}