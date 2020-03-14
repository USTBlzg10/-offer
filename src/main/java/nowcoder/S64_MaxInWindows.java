package nowcoder;

import java.util.ArrayList;

/**
 * @author LiuZhiguo
 * @date 2020/2/18 18:46
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
 * 那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}，
 * {2,3,4,2,6,[2,5,1]}。
 */
public class S64_MaxInWindows {
    public ArrayList<Integer> maxInWindows(int[] num, int size){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (size <= 0)
            return list;
        int length = num.length;
        for (int i=0;i<length - size+1;i++){
            int j=i;
            int max = 0;
            while (j < i+size){
                if (num[j] > max)
                    max = num[j];
                j++;
            }
            list.add(max);
        }
        return list;
    }
    public static void main(String[] args){
        S64_MaxInWindows s64 = new S64_MaxInWindows();
        int[] num = {10,14,12,11};
        System.out.println(s64.maxInWindows(num, 0));
    }
}
