package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2020/2/10 23:41
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class S48_Add {
    //利用位运算
    public int add(int num1, int num2){
        while (num2 != 0){
            int tmp = num1 ^ num2;//除进位的结果
            num2 = (num1 & num2) << 1;//进位的结果
            num1 = tmp;
        }
        return num1;
    }
    public static void main(String[] args){
        S48_Add s48 = new S48_Add();
        System.out.println(s48.add(12, 14));
    }
}
