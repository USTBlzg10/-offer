package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2020/2/13 11:35
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */
public class S53_IsNumeric {
    public boolean isNumeric(char[] str){
        //正则表达式
        String string = String.valueOf(str);
        return string.matches("[\\+\\-]?\\d*(\\.\\d+)?([eE][\\+\\-]?\\d+)?");
        /**
         *[\\+\\-]? -------------------->表示是否有正负号
         * \\d*------------------------->表示符号后是否紧跟着整数数字
         * （\\.\\d+)?------------------>表示.后面必须紧跟数字，表示小数
         * ([eE][\\+\\-]?\\d+)?--------->表示出现e或者E指数形式后是否紧跟+-号，+-号后必须紧跟整数数字
         */
        //常规方法
        /*boolean signal = false;
        boolean decimal = false;
        boolean hasE = false;
        for (int i=0;i<str.length;i++){
            if (str[i] == 'e' || str[i] == 'E'){
                //e后面必须有数字
                if (i == str.length-1)
                    return false;
                //不能出现两个e
                if (hasE)
                    return false;
                //e前面只能是数字
                if (i == 0 || str[i-1] < '0' || str[i-1] > '9')
                    return false;
                hasE = true;
            }else if (str[i] == '+' || str[i] == '-'){
                //若符号不是第一次出现，那么这个符号只能出现在e的后面
                if (signal && str[i+1] != 'e'&& str[i+1] != 'E')
                    return false;
                //第一次出现符号，判断其前是否是e
                if (!signal && str[i-1] != 'e' && str[i-1] != 'E')
                    return false;
                signal = true;
            }else if (str[i] == '.'){
                //若存在小数点，判断其是否出现在e后
                if (hasE){
                    for (;i>=0;i--){
                        if (str[i] == 'e' ||str[i] == 'E')
                            return false;
                    }
                }
                if (signal)
                    return false;
                signal = true;
            }
            else if (str[i] < '0' || str[i] > '9')
                return false;
        }
        return true;*/
    }
    public static void main(String[] args){
        S53_IsNumeric s53 = new S53_IsNumeric();
        char[] str = {'3','.','e','4'};
        System.out.println(s53.isNumeric(str));
    }
}
