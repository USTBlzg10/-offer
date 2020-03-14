package leetcodeTest.JavaVersion.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @author LiuZhiguo
 * @date 2019/10/29 11:20
 * 三数求和
 */
public class ThreeSum_15 {
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int k=0;k<nums.length-2;k++){
            if (nums[k] > 0)
                break;
            if (k >0 && nums[k]==nums[k-1])
                continue;
            int i = k+1, j = nums.length-1;
            while (i<j){
                int sum = nums[k]+nums[i]+nums[j];
                if (sum < 0)
                    while(i < j && nums[i] == nums[++i]);
                else if (sum >0)
                    while(i < j && nums[j] == nums[--j]);
                else {
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[k],nums[i],nums[j])));
                    while(i < j && nums[i] == nums[++i]);
                    while(i < j && nums[j] == nums[--j]);
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        ThreeSum_15 threeSum_15 = new ThreeSum_15();
        int[] nums = {-2,0,0,2,2};
        System.out.println(threeSum_15.threeSum(nums));
    }
}
