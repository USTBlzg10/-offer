package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2019/12/24 9:52
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 保证base和exponent不同时为0
 */
public class S12_Power {
    public double power(double base, int exponent) {
        if (equal(base, 0.0) && exponent < 0){
            return 0.0;
        }
        int absexponent = exponent;
        if (exponent < 0) {
            absexponent = -exponent;
        }
        double res = getPower(base, absexponent);
        if (exponent < 0)
            res = 1.0/res;
        return res;
    }
    boolean equal(double num1, double num2){
        if ((num1 - num2 > -0.0000001) && (num1 - num2) < 0.0000001){
            return true;
        }
        return false;
    }
    double getPower(double b, int e){
        if (e == 0)
            return 1.0;
        if (e == 1)
            return b;
        double result = getPower(b, e>>1);
        result *= result;
        if ((e & 1)==1)
            result *= b;
        return result;
    }
    public static void main(String[] args){
        S12_Power s12 = new S12_Power();
        double result = s12.power(2,-3);
        System.out.print(result);
    }
}
