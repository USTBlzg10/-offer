package leetcodeTest.JavaVersion;

/**
 * @author LiuZhiguo
 * @date 2019/12/4 20:33
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * 你可以假设数组中不存在重复的元素。
 * 你的算法时间复杂度必须是 O(logn) 级别。
 */
public class Search_33 {
    /*int findP(int[] nums){
        int low=0, high = nums.length-1;
        while (low < high){
            int mid = low + (high - low)/2;
            if (nums[mid] > nums[low])
                low = mid +1;
            else
                high = mid -1;
        }
        return low;
    }*/
    public int search(int[] nums, int target){
        int len = nums.length;
        if (len == 0) {
            return -1;
        }
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int mid = (left + right + 1) >>> 1;
            if (nums[mid] < nums[right]) {
                // 使用上取整的中间数，必须在上面的 mid 表达式的括号里 + 1
                if (nums[mid] <= target && target <= nums[right]) {
                    // 下一轮搜索区间是 [mid, right]
                    left = mid;
                } else {
                    // 只要上面对了，这里不用思考，可以一下子写出来
                    right = mid - 1;
                }

            } else {

                // [left, mid] 有序，但是为了和上一个 if 有同样的收缩行为，
                // 我们故意只认为 [left, mid - 1] 有序
                // 当区间只有 2 个元素的时候 int mid = (left + right + 1) >>> 1; 一定会取到右边
                // 此时 mid - 1 不会越界，就是这么刚刚好

                if (nums[left] <= target && target <= nums[mid - 1]) {
                    // 下一轮搜索区间是 [left, mid - 1]
                    right = mid - 1;
                } else {
                    left = mid;
                }
            }
        }
        // 有可能区间内不存在目标元素，因此还需做一次判断
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }
    public static void main(String[] args) {
        Search_33 search_33 = new Search_33();
        int[] nums = {4,5,6,7,8,0,1,2,3};
        System.out.println(search_33.search(nums, 0));
    }
}
