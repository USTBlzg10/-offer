package leetcodeTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author LiuZhiguo
 * @date 2020/3/1 12:11
 * 给定两个以升序排列的整形数组 nums1 和 nums2, 以及一个整数 k。
 * 定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2。
 * 找到和最小的 k 对数字 (u1,v1), (u2,v2) ... (uk,vk)。
 * 示例 1:
 *
 * 输入: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
 * 输出: [1,2],[1,4],[1,6]
 * 解释: 返回序列中的前 3 对数：
 *      [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
 */
public class S373_kSmallestPairs {
    public ArrayList<ArrayList<Integer>> kSmallestPairs(int[] num1, int[] num2, int k){
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        PriorityQueue<int[]> pQ = new PriorityQueue<int[]>(k, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return twoSum(o2)- twoSum(o1);
            }
        });
        for (int n1: num1)
            for (int n2: num2){
                int[] arr = new int[]{n1, n2};
                pQ.add(arr);
                if (pQ.size() > k)
                    pQ.poll();
            }
        while (!pQ.isEmpty()){
            ArrayList<Integer> list = new ArrayList<Integer>();
            int[] arr = pQ.poll();
            list.add(arr[0]);
            list.add(arr[1]);
            res.add(list);
        }
        return res;
    }
    public int twoSum(int[] arr){
        return arr[0]+arr[1];
    }
    public static void main(String[] args){
        S373_kSmallestPairs s373 = new S373_kSmallestPairs();
        int[] num1 = {1,7,11};
        int[] num2 = {2,4,6};
        System.out.println(s373.kSmallestPairs(num1, num2, 3));
    }
}
