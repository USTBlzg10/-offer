package nowcoder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author LiuZhiguo
 * @date 2020/1/9 19:13
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class S29_GetLeastKNumbers {
    public ArrayList<Integer> getLeastKNumbers(int[] input, int k){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int length = input.length;
        if (length == 0 || k <= 0)
            return result;
        //大根堆
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i=0;i<length;i++){
            if (maxHeap.size() != k){
                maxHeap.offer(input[i]);
            }
            else if (maxHeap.peek() > input[i]){
                maxHeap.remove();
                maxHeap.offer(input[i]);
            }
        }
        result.addAll(maxHeap);
        return result;
    }
    public static void main(String[] args){
        S29_GetLeastKNumbers s29 = new S29_GetLeastKNumbers();
        int[] input = {4,5,1,6,2,7,3,8};
        System.out.println(s29.getLeastKNumbers(input, 4));
    }
}
