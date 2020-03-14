package leetcodeTest.JavaVersion.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public int[] twoSum(int[] array, int target) throws IllegalArgumentException {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            int another = target - array[i];
            if (map.containsKey(another)) {
                return new int[]{map.get(another), i };
            }
            map.put(array[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args){
        int [] array = {2, 7, 11, 15};
        int target = 26;
        TwoSum_1 twoSum = new TwoSum_1();
        int [] result = twoSum.twoSum(array, target);
        System.out.println(Arrays.toString(result));
    }
}
