package leetcodeTest.JavaVersion.DynamicProgramming;

/**
 * @author LiuZhiguo
 * @date 2019/9/27 14:34
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * 例如：输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 */
public class LongestPalindrome_5f1 {
    public String longestPalindrome(String s) {
        if (s.length() ==0 || s==null)
            return null;
        int max=0;
        String res = "";
        for (int i=0;i<s.length();i++){
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                if (isPalindrome(temp) && temp.length()>max) {
                    res = temp;
                    max = temp.length();
                }
            }
        }
        return res;
    }
    public boolean isPalindrome(String s) {
        int length = s.length();
        for (int i=0;i<length/2;i++) {
            if (s.charAt(i) != s.charAt(length-1-i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        LongestPalindrome_5f1 longestPalindrome_5 = new LongestPalindrome_5f1();
        String str = "a";
        System.out.println(longestPalindrome_5.longestPalindrome(str));
    }
}
