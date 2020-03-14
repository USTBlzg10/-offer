package nowcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiuZhiguo
 * @date 2020/1/8 19:12
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,
 * 则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
public class S27_Permutatioin {
    public ArrayList<String> Permutation(String str){
        ArrayList<String> result = new ArrayList<String>();
        if (str.length() == 0) return result;
        fun(str.toCharArray(), result, 0);
        return result;
    }
    private void fun(char[] ch, List<String> list, int i){
        if (i == ch.length-1){
            if (!list.contains(new String(ch))) {
                list.add(new String(ch));
                return;
            }
        }
        else {
            for (int j=i;j<ch.length;j++){
                swap(ch,i,j);
                fun(ch,list,i+1);
                swap(ch,i,j);
            }
        }
    }
    private void swap(char[] ch, int i, int j){
        char t = ch[i];
        ch[i] = ch[j];
        ch[j] = t;
    }
    public static void main(String[] args){
        S27_Permutatioin s27 = new S27_Permutatioin();
        String str = "abc";
        System.out.println(s27.Permutation(str));
    }
}
