package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2020/1/15 20:21
 * 1~13中包含1的数字有1、10、11、12、13因此共出现6次
 *  */
public class S31_NumberOf1Between1AndN {
    public int numberOf1Between1AndN(int n){
        if (n <= 0)
            return 0;
        int number = 0;
        for (int i=1;i<=n;i++){
            number += number(i);
        }
        return number;
    }
    public int number(int n){
        int number = 0;
        while (n > 0){
            if (n % 10 ==1)
                number++;
            n /= 10;
        }
        return number;
    }
    public static void main(String[] args){
        S31_NumberOf1Between1AndN s31 = new S31_NumberOf1Between1AndN();
        System.out.println(s31.numberOf1Between1AndN(100));
    }
}
