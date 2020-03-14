package leetcodeTest.JavaVersion;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length == 1){
            return nums.length;
        }
        int i = 0,j =1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {1,2,3,4,5,5,6,6,7};
        int length = removeDuplicates.removeDuplicates(nums);
        System.out.println(length);
    }
}
