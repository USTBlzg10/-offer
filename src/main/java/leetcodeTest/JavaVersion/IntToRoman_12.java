package leetcodeTest.JavaVersion;

/**
 * @author LiuZhiguo
 * @date 2019/11/12 9:55
 */
public class IntToRoman_12 {
    public String intToRoman(int num){
        StringBuilder ans = new StringBuilder();
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};  // 罗马数字
        int[] arab = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};  // 阿拉伯数字
        int index = 0;
        while (num>0) {
            int count = num/arab[index];
            while (count>0){
                ans.append(roman[index]);
                count--;
            }
            num %= arab[index];
            ++index;
        }
        return ans.toString();
    }
    public static void main(String[] args){
        IntToRoman_12 intToRoman_12 = new IntToRoman_12();
        System.out.println(intToRoman_12.intToRoman(1994));
    }
}
