package nowcoder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author LiuZhiguo
 * @date 2020/2/18 18:46
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
 * 那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个：
 * {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}，
 * {2,3,4,2,6,[2,5,1]}。
 */
public class S64_MaxInWindows_new {


    public ArrayList<Integer> maxInWindows(int[] num, int size){
        //创建大根堆
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(size, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (size <= 0)
            return list;
        int length = num.length;
        for (int i=0;i<size;i++){
            heap.offer(num[i]);
        }
        list.add(heap.peek());
        for (int i=1;i<length-size+1;i++){
            heap.remove(num[i-1]);
            heap.offer(num[i+size-1]);
            list.add(heap.peek());
        }
        return list;
    }
    public static void main(String[] args){
        S64_MaxInWindows_new s64 = new S64_MaxInWindows_new();
        int[] num = {2,3,4,2,6,2,5,1};
        System.out.println(s64.maxInWindows(num, 3));
    }
}
