package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2020/2/10 16:20
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class S47_Sum {
    public int sum(int n){
        //不能使用上述这些关键字，考虑递归方法
        int sum = n;
        boolean ans = (n > 0) && ((sum+=sum(n-1))>0);
        return sum;
    }
    public static void main(String[] args){
        S47_Sum s47 = new S47_Sum();
        System.out.println(s47.sum(10));
    }
}
