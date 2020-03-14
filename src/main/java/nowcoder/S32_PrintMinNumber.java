package nowcoder;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author LiuZhiguo
 * @date 2020/1/15 20:51
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class S32_PrintMinNumber {
    public String printMinNumber(int[] array){
        int length = array.length;
        String[] str = new String[length];
        StringBuilder sb = new StringBuilder();
        //将数组array中的数转成String加入到str数组中
        for (int i=0;i<length;i++){
            str[i] = String.valueOf(array[i]);
        }
        //str中的String类型比较排序
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String c1 = o1 + o2;
                String c2 = o2 + o1;
                return c1.compareTo(c2);
            }
        });
        for (int i=0;i<length;i++){
            sb.append(str[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args){
        S32_PrintMinNumber s32 = new S32_PrintMinNumber();
        int[] array = {3, 32, 321};
        System.out.println(s32.printMinNumber(array));
    }
}
