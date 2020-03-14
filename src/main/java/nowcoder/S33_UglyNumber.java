package nowcoder;

import java.util.ArrayList;

/**
 * @author LiuZhiguo
 * @date 2020/1/28 23:39
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，
 * 但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class S33_UglyNumber {
    public int uglyNumber(int index){
        if (index < 7) return index;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1); //将1加入丑数数组中
        int p2 = 0, p3 = 0, p5 = 0;
        while (arr.size() < index) {
            int v2 = arr.get(p2) * 2;
            int v3 = arr.get(p3) * 3;
            int v5 = arr.get(p5) * 5;
            int min = Math.min(v2, Math.min(v3, v5));
            arr.add(min);
            if (v2 == min) p2++;
            if (v3 == min) p3++;
            if (v5 == min) p5++;
        }
        return arr.get(arr.size()-1);
    }
    public static void main(String[] args){
        S33_UglyNumber s33 = new S33_UglyNumber();
        System.out.println(s33.uglyNumber(100));
    }
}
