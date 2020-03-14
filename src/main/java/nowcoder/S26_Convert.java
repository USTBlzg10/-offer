package nowcoder;

import java.util.Stack;

/**
 * @author LiuZhiguo
 * @date 2020/1/7 18:45
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class S26_Convert {
    public TreeNode Convert(TreeNode pRootOfTree){
        if (pRootOfTree == null) return null;
        TreeNode p = pRootOfTree;
        TreeNode pre = null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        boolean isFirst = true;
        while (p != null || !stack.isEmpty()){
            while (p != null){
                stack.push(p);
                p = p.left;
            }
            p = stack.pop(); //出栈
            if (isFirst){
                pRootOfTree = p;
                pre = p;
                isFirst = false;
            }
            else {
                p.left = pre;
                pre.right = p;
                pre = p;
            }
            p = p.right;
        }
        return pRootOfTree;
    }
}
