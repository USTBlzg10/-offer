package leetcodeTest.JavaVersion.String;

/**
 * @author LiuZhiguo
 * @date 2019/10/9 20:29
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class LengthOfLongestSubstring_3f1 {
    public int lengthOfLongestSubstring(String s) {
        char[]chars =s.toCharArray();
        int maxLength = 0;
        int index = 0;
        for (int j=0;j<chars.length;j++){
            for (int i=index;i<j;i++){
                if (chars[i]==chars[j]){
                    maxLength = Math.max(maxLength, j-index);
                    index = i +1;
                    break;
                }
            }
        }
        return Math.max(chars.length-index, maxLength);
    }
    public static void main(String[] args){
        LengthOfLongestSubstring_3f1 lengthOfLongestSubstring_3 = new LengthOfLongestSubstring_3f1();
        System.out.println(lengthOfLongestSubstring_3.lengthOfLongestSubstring("abcabcbb"));
    }
}
