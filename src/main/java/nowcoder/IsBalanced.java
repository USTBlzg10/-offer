package nowcoder;
import java.lang.Math;
//普通方法
public class IsBalanced {
    /*public boolean IsBalanced_Sulotion(TreeNode root) {
        if (root == null)
            return true;
        int LD = getDepth(root.left);
        int RD = getDepth(root.right);
        if (LD - RD >1 || RD - LD >1)
            return false;
        return IsBalanced_Sulotion(root.left) && IsBalanced_Sulotion(root.right);
    }
    public int getDepth(TreeNode root) {
        if (root == null)
            return 0;
        int depth;
        int LD = getDepth(root.left);
        int RD = getDepth(root.right);
        depth = Math.max(LD, RD)+1;
        return depth;
    }*/
    //方法二
    public boolean IsBalanced_Solution(TreeNode root) {
        return getDepth(root) != -1;
    }
    public int getDepth(TreeNode root) {
        if (root == null)
            return 0;
        int LD = getDepth(root.left);
        if (LD == -1) return -1;
        int RD = getDepth(root.right);
        if (RD == -1) return -1;
        return Math.abs(LD - RD) >1 ? -1: Math.max(LD, RD)+1;
    }
}
