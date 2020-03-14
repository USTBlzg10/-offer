package nowcoder;
/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */
public class IsNumeric_53 {

    //正则的方法
    public boolean isNumeric(char[] str) {
        String string = String.valueOf(str);
        return string.matches("[\\+-]?[0-9]*(\\.[0-9]*)?([eE][\\+-]?[0-9]+)?");
    }
    /*public boolean isNumeric(char[] str) {
        boolean signal = false, decimal = false, hasE = false;
        for (int i=0;i<str.length;i++) {
            if (str[i] == 'e' || str[i] == 'E') {
                //e后面必须有数字，若其实最后一位不通过
                if (i==str.length-1)
                    return false;
                if (hasE)
                    return false;
                hasE = true;
            }else if (str[i] == '+' || str[i] == '-') {
                //符号不是第一次出现，那么后面出现的话只能是在e的后面
                if (signal && str[i-1] != 'E' && str[i-1] != 'e')
                    return false;
                //第一次出现，如果不是在第一位还是判断一下是不是在e的后面
                if (!signal && i>0 && str[i-1] !='e' && str[i-1] !='E')
                    return false;
                signal = true;
            }else if (str[i] == '.'){
                //如果存在e并且e后面为小数则不通过
                if (hasE) {
                    for (;i>=0;i--) {
                        if (str[i] == 'e' || str[i] == 'E')
                            return false;
                    }
                }
                //不能出现多个小数点
                if (decimal)
                    return false;
                decimal = true;
            } else if (str[i] < '0' || str[i] > '9')
                return false;
        }
        return true;
    }*/
    public static void main(String[] args) {
        IsNumeric_53 isNumeric_53 = new IsNumeric_53();
        char[] str = {'+','1','0','0'};
        System.out.println(isNumeric_53.isNumeric(str));
    }
}
