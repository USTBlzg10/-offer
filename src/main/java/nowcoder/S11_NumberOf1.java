package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2019/12/23 17:54
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class S11_NumberOf1 {
    public int numberOf1(int n){
        int count = 0;
        /*while (n != 0 ) {
            if ((n & 1) == 1)
                count++;
            n = n >>> 1;
        }
        return count;*/
        /* 利用flag左移来比较每一位
        int flag = 1;
        while (flag != 0){
            if ((n & flag) != 0)
                count++;
            flag = flag << 1;
        }
        return count;*/
        while (n != 0){
            count++;
            n = n & (n-1);
        }
        return  count;
    }
    public static void main(String[] args){
        S11_NumberOf1 s11 = new S11_NumberOf1();
        System.out.print(s11.numberOf1(-32));
    }
}
