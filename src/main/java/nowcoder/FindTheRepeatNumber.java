package nowcoder;

import java.util.ArrayList;

/**
 * Parameters:
 * numbers:     an array of integers
 * length:      the length of array numbers
 * duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
 *             Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
 *  这里要特别注意~返回任意重复的一个，赋值duplication[0]
 *  Return value:       true if the input is valid, and there are some duplications in the array number
 *                     otherwise false
 */
public class FindTheRepeatNumber {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        boolean result = false;
        for (int i=0;i<length;i++) {
            if (numbers[i] <0 || numbers[i] >= length)
                return result;
        }
        for (int i=0;i<length;i++){
            if (arrayList.contains(numbers[i])) {
                duplication[0] = numbers[i];
                result = true;
                break;
            }
            else arrayList.add(numbers[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] numbers = {2,3,1,0,2,5,4};
        int length = numbers.length;
        int[] duplication =new int[1];
        FindTheRepeatNumber findTheRepeatNumber = new FindTheRepeatNumber();
        boolean result = findTheRepeatNumber.duplicate(numbers, length, duplication);
        System.out.println(result);
    }
}
