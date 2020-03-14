package leetcodeTest.JavaVersion.Array;

/**
 * @author LiuZhiguo
 * @date 2019/10/10 9:28
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * 例如：nums1 = [1, 2]
 * nums2 = [3, 4]
 * 则中位数是 (2 + 3)/2 = 2.5
 */
public class FindMedianSortedArrays_4f1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int m = nums1.length;
        int n = nums2.length;
        if (m==0&&n==0)
            return 0;
        int[] nums = new int[m+n];
        for (int a=0;a<m;a++)
            nums[a] = nums1[a];
        for (int b=m;b<m+n;b++)
            nums[b] = nums2[b-m];
        for(int i=m;i<m+n;i++){
            int temp = nums[i];
            for (int j=i-1;j>=0;j--){
                if (nums[j]>temp){
                    nums[j+1] = nums[j];
                    if (j==0)
                        nums[j]=temp;
                }
                else {
                    nums[j+1] = temp;
                    break;
                }
            }
        }
        for (int k=0;k<nums.length;k++)
            System.out.println(nums[k]);
        int mid = (m+n)/2;
        if ((m+n)%2==1)
            return nums[mid];
        else
            return ((float) nums[mid-1]+(float)nums[mid])/2;
    }
    public static void main(String[] args){
        FindMedianSortedArrays_4f1 findMedianSortedArrays = new FindMedianSortedArrays_4f1();
        int[] nums1={3};
        int[] nums2={-2,-1};
        System.out.println(findMedianSortedArrays.findMedianSortedArrays(nums1,nums2));
    }
}
