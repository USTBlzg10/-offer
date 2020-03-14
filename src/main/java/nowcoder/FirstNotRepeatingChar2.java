/*
package nowcoder;

import java.util.HashMap;

public class FirstNotRepeatingChar2 {
    public int firstNotRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i=0;i<str.length();i++) {
            if (map.containsKey(str.charAt(i))) {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), ++count);
            }
            else
                map.put(str.charAt(i), 1);
        }
        for (int i=0;i<str.length();i++) {
            if (map.get(str.charAt(i))==1)
                return i;
        }
        return -1;
    }
    public static void  main(String[] args){
        FirstNotRepeatingChar2 firstNotRepeatingChar = new FirstNotRepeatingChar2();
        String str ="skdlfjksljflbjalkfhisahdfjlak";
        int i =firstNotRepeatingChar.firstNotRepeatingChar(str);
        System.out.println(str.charAt(i));
        System.out.println(i);
    }
}
*/
