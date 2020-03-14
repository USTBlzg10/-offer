package nowcoder;

import java.util.ArrayList;

public class FindTheRepeatNumberExellence {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (numbers == null)
            return false;
        int temp;
        for (int i=0;i<length;i++) {
            if (numbers[i] <0 || numbers[i] >=length)
                return false;
            //i和numbers[i]相比，若不等则numbers[i]和numbers[numbers[i]]交换
            while (i != numbers[i]) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] =numbers[i];
                    return true;
                }
                else {
                    temp = numbers[i];
                    numbers[i] = numbers[numbers[i]];
                    numbers[temp] =temp;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,1,0,7};
        int length = nums.length;
        int[] result = new int[1];
        FindTheRepeatNumberExellence findTheRepeatNumberExellence = new FindTheRepeatNumberExellence();
        boolean res = findTheRepeatNumberExellence.duplicate(nums, length, result);
        System.out.println(res);
    }
}
