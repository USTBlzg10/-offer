package leetcodeTest.JavaVersion.Array;

/**
 * @author LiuZhiguo
 * @date 2019/10/10 9:28
 * 寻找两个有序数组的中位数，采用找第k小的元素的方法
 * 采用递归的思路，为了防止数组长度小于 k/2，所以每次比较 min(k/2，len(数组) 对应的数字，
 * 把小的那个对应的数组的数字排除，将两个新数组进入递归，并且 k 要减去排除的数字的个数。
 * 递归出口就是当 k=1 或者其中一个数字长度是 0 了。
 */

public class FindMedianSortedArrays_4f2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int left = (n + m + 1) / 2;
        int right = (n + m + 2) / 2;
        //将偶数和奇数的情况合并，如果是奇数，会求两次同样的 k 。
        return (getKth(nums1, 0, m - 1, nums2, 0, n - 1, left) +
                getKth(nums1, 0, m - 1, nums2, 0, n - 1, right)) * 0.5;
    }
    private int getKth(int[] nums1,int start1, int end1,int[] nums2,int start2,int end2,int k){
        int len1 = end1 - start1 +1;
        int len2 = end2 - start2 +1;
        if (len1 > len2) return getKth(nums2, start2, end2, nums1, start1, end1, k);
        if (len1 == 0) return nums2[start2 + k -1];
        if (k == 1) return Math.min(nums1[start1], nums2[start2]);
        int i = start1 + Math.min(len1, k/2)-1;
        int j = start2 + Math.min(len2, k/2)-1;
        if (nums1[i] < nums2[j]) return getKth(nums1,i+1,end1,nums2,start2,end2,k-(i-start1+1));
        else return getKth(nums1,start1,end1,nums2,j+1,end2,k-(j-start2+1));
    }
    public static void main(String[] args){
        FindMedianSortedArrays_4f2 findMedianSortedArrays = new FindMedianSortedArrays_4f2();
        int[] nums1={1,2,};
        int[] nums2={4};
        System.out.println(findMedianSortedArrays.findMedianSortedArrays(nums1,nums2));
    }
}
