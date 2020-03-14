package nowcoder;

import java.util.ArrayList;
import java.util.List;

public class FindNumsAppearOnceExellence {
    public List FindNumsAppearOnceExellence(int[] array, int []num1, int []num2) {
        int length = array.length;
        if (length == 2) {
            num1[0] = array[0];
            num2[0] = array[1];
        }
        int resultBit = 0;
        for (int i=0;i<length;i++) {
            resultBit ^= array[i];
        }
        int index = findFirst1(resultBit);
        //分组
        for (int i=0;i<length;i++) {
            if (isBit1(array[i], index))
                num1[0] ^= array[i];
            else
                num2[0] ^= array[i];
        }
        List<Integer> list = new ArrayList<Integer>();
        list.add(num1[0]);
        list.add(num2[0]);
        return list;
    }
    private int findFirst1(int resultBit) {
        int index = 0;
        while ((resultBit & 1) == 0 && index<32) {
            resultBit >>= 1;
            index++;
        }
        return index;
    }
    private boolean isBit1(int target, int index) {
        return  (((target >> index) & 1) ==1);
    }
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 3, 4, 4, 5,6,6,7,7,8,9,9};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        FindNumsAppearOnceExellence findNumsAppearOnceExellence = new FindNumsAppearOnceExellence();
        System.out.println(findNumsAppearOnceExellence.FindNumsAppearOnceExellence(array, num1, num2));
    }
}
