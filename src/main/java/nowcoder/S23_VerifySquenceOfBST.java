package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2019/12/29 20:36
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class S23_VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0)
            return false;
        if(sequence.length == 1)
            return true;
        return judge(sequence, 0, sequence.length-1);
    }
    public boolean judge(int []a, int start, int end){
        if(start >= end)
            return true;
        int i = start;
        while(a[i] < a[end]){
            ++i;
        }
        for(int j=i;j<end;j++){
            if(a[j]< a[end])
                return false;
        }
        return judge(a,start,i-1) && judge(a,i,end-1);
    }
    public static void main(String[] args){
        S23_VerifySquenceOfBST s23 = new S23_VerifySquenceOfBST();
        int[] sequence = {3, 5, 4, 7, 9, 8, 2};
        System.out.println(s23.VerifySquenceOfBST(sequence));
    }
}
