package leetcodeTest.JavaVersion.Array;

/**
 * @author LiuZhiguo
 * @date 2019/9/27 11:14
 */
public class MaxArea_11 {
    public int maxArea(int[] height) {
        //暴力法：
        /*int length = height.length;
        int max=0;
        if (height ==null || length ==0)
            return 0;
        int capacity;
        for (int i=0;i<length;i++) {
            for (int j=i+1;j<length;j++) {
                capacity =(j-i) * Math.min(height[i], height[j]);
                if (max<capacity)
                    max = capacity;
            }
        }
        return max;*/
        //动态规划法：
        int length = height.length;
        int max =0;
        if (height ==null || length ==0)
            return 0;
        int i=0, j=length-1;
        while (i<j) {
            int h =Math.min(height[i], height[j]);
            max = Math.max(max, h*(j-i));
            if (height[i] < height[j]) i++;
            else j--;
        }
        return max;
    }
    public static void main(String[] args) {
        MaxArea_11 maxArea_11 = new MaxArea_11();
        int[] height = {1,1};
        System.out.println(maxArea_11.maxArea(height));
    }
}
