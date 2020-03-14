package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2019/12/17 19:29
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class S7_Fibonacci {
    public int Fibonacci(int n) {
        if (n < 2)
            return n;
        /*//递归
        int result = 0;
        if (n>1&&n<=39){
            result = Fibonacci(n-1) + Fibonacci(n-2);
        }
        return result;*/
        //利用for循环，迭代
        int num1 = 0; int num2 = 1;
        int current = 0;
        while (n-->1){
        //for (int i=2;i<=n;i++) {
            current = num1 + num2;
            num1 = num2;
            num2 = current;
        }
        return current;
    }
    public static void main(String[] args){
        S7_Fibonacci s7 = new S7_Fibonacci();
        System.out.println(s7.Fibonacci(10));
    }
}
