package leetcodeTest.JavaVersion.DynamicProgramming;

/**
 * @author LiuZhiguo
 * @date 2019/9/27 14:34
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 * 例如：输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 */
public class LongestPalindrome_5f2 {
    public String longestPalindrome(String s) {
        if (s.equals(""))
            return "";
        String reverse = new StringBuffer(s).reverse().toString(); //反转字符串
        String ans = s;
        int length = s.length();
        int[][]arr = new int[length][length];
        int maxLen =0;
        int maxEnd =0;
        for (int i=0;i<length;i++) {
            for (int j=0;j<length;j++) {
                if (ans.charAt(i) == reverse.charAt(j)) {
                    if (i ==0 || j==0)
                        arr[i][j] = 1;
                    else
                        arr[i][j] = arr[i-1][j-1] +1;
                }
                /**********修改的地方*******************/
                if (arr[i][j] > maxLen) {
                    int beforeRev = length - 1 - j;
                    if (beforeRev + arr[i][j] - 1 == i) { //判断下标是否对应
                        maxLen = arr[i][j];
                        maxEnd = i;
                    }
                    /*************************************/
                }
            }
        }
        return s.substring(maxEnd - maxLen+1, maxEnd+1);
    }

    public static void main(String[] args) {
        LongestPalindrome_5f2 longestPalindrome_5 = new LongestPalindrome_5f2();
        String str = "aabcbad";
        System.out.println(longestPalindrome_5.longestPalindrome(str));
    }
}
