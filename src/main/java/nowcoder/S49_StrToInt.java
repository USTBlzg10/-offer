package nowcoder;

import scala.Int;

/**
 * @author LiuZhiguo
 * @date 2020/2/11 11:47
 */
public class S49_StrToInt {
    public int strToInt(String str){
        if (str == null || str.length() == 0)
            return 0;
        char[] chars = str.trim().toCharArray();
        int start = 0;
        int symbol = 1;
        int res = 0;
        int temp = 0;
        if (chars[start] == '+')
            start = 1;
        else if (chars[start] == '-'){
            start = 1;
            symbol = -1;
        }
        for (int i=start;i<chars.length;i++){
            if (chars[i] < '0' || chars[i] > '9')
                return 0;
            //当前各位数字
            int digit = chars[i] - '0';
            temp = res * 10 + digit;
            //判断正数是否溢出
            if (symbol == 1 && res * 10 > Integer.MAX_VALUE - digit)
                return 0;
            //判断负数是否溢出
            if (symbol == -1 && res * 10 < Integer.MIN_VALUE -digit)
                return 0;
            res = temp;
        }
        return res * symbol;
    }
    public static void main(String[] args){
        S49_StrToInt s49 = new S49_StrToInt();
        System.out.println(s49.strToInt("-2147483649"));
    }
}
