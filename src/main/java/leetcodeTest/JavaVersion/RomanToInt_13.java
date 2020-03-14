package leetcodeTest.JavaVersion;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LiuZhiguo
 * @date 2019/11/12 10:39
 */
public class RomanToInt_13 {
    public int romanToInt(String s){
        /*方法一
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("I",1);
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",90);
        map.put("C",100);
        map.put("CD",400);
        map.put("D",500);
        map.put("CM",900);
        map.put("M",1000);
        int res = 0;
        for (int i=0;i<s.length();){
            if (i+1 <s.length() && map.containsKey(s.substring(i,i+2))){
                res += map.get(s.substring(i,i+2));
                i += 2;
            }else {
                res += map.get(s.substring(i,i+1));
                i += 1;
            }
        }
        return res;*/
        int res =0;
        int preNum = getValue(s.charAt(0));
        for (int i=1;i<s.length();i++) {
            int num = getValue(s.charAt(i));
            if (preNum < num)
                res -=preNum;
            else
                res += preNum;
            preNum = num;
        }
        res += preNum;
        return res;
    }

    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args){
        RomanToInt_13 romanToInt_13 = new RomanToInt_13();
        System.out.println(romanToInt_13.romanToInt("LVIII"));
    }
}
