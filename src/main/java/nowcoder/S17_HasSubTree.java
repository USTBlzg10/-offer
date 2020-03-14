package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2019/12/26 20:35
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * （ps：我们约定空树不是任意一个树的子结构）
 */
public class S17_HasSubTree {
    public boolean hasSubTree(TreeNode root1, TreeNode root2){
        boolean flag = false;
        if (root1 != null && root2 != null){
            if (root1.val == root2.val)
                flag = Tree1HasTree2(root1, root2);
            if (!flag)
                flag = Tree1HasTree2(root1.left, root2);
            if (!flag)
                flag = Tree1HasTree2(root1.right, root2);
        }
        return flag;
    }
    public boolean Tree1HasTree2(TreeNode root1, TreeNode root2){
        if (root2 == null)
            return true;
        if (root1 == null)
            return false;
        if (root1.val != root2.val)
            return false;
        return Tree1HasTree2(root1.left, root2.left) && Tree1HasTree2(root1.right,root2.right);
    }
    public static void main(String[] args){
        Integer[] array1 = {8,9,2,1,3,4,null};
        Integer[] array2 = {1,3,2};
        S17_HasSubTree s17 = new S17_HasSubTree();
        PrintTreeLayer p = new PrintTreeLayer();
        TreeNode root1 = p.arrayToTree(array1, 0);
        TreeNode root2 = p.arrayToTree(array2, 0);
        System.out.print(s17.hasSubTree(root1, root2));
    }
}
