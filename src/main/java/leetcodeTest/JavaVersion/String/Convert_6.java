package leetcodeTest.JavaVersion.String;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiuZhiguo
 * @date 2019/10/11 10:44
 */
public class Convert_6 {
    public String convert(String s, int numRows) {
        if (numRows<=1)
            return s;
        List<StringBuilder> rows = new ArrayList<StringBuilder>();
        for (int i=0;i<numRows;i++) rows.add(new StringBuilder());
        int i=0, flag = -1;
        for (char c:s.toCharArray()){
            rows.get(i).append(c);
            if (i==0 || i==numRows-1) flag = -flag;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row:rows) res.append(row);
        return res.toString();
    }
    public static void main(String[] args){
        Convert_6 convert_6 = new Convert_6();
        String s = "LEETCODEISHIRING";
        System.out.println(convert_6.convert(s,3));
    }
}
