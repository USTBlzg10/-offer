package leetcodeTest.JavaVersion;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=val){
                nums[l] = nums[i];
                l++;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] array = {0,1,2,2,3,0,4,2};
        int length = removeElement.removeElement(array, 2);
        System.out.println(length);
    }
}
