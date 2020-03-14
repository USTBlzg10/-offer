package nowcoder;

import java.util.HashMap;

/**
 * @author LiuZhiguo
 * @date 2020/1/29 12:37
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */
public class S34_FirstNotRepeatingChar {
    public int firstNotRepeatingChar(String str){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i=0;i<str.length();i++){
            if (map.containsKey(str.charAt(i))){
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), count+1);
            }
            else map.put(str.charAt(i), 1);
        }
        for (int i=0;i<str.length();i++){
            if (map.get(str.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
    public static void main(String[] args){
        S34_FirstNotRepeatingChar s34 = new S34_FirstNotRepeatingChar();
        String str = "skdlfjksljflbjalkfhisahdfjlak";
        System.out.println(s34.firstNotRepeatingChar(str));
    }
}
