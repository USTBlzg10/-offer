package nowcoder;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author LiuZhiguo
 * @date 2020/2/18 12:04
 */
public class S63_GetMedian {
    //小顶堆
    private PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    //大顶堆
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(15, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });
    int count = 0;
    public void insert(Integer num){
        //count为偶数时，先进大根堆，将大根堆的堆顶放到小根堆
        if ((count & 1) == 0) {
            if (!maxHeap.isEmpty() && num < maxHeap.peek()) {
                maxHeap.offer(num);
                num = maxHeap.poll();
            }
            minHeap.offer(num);
        }
        else {
            if (!minHeap.isEmpty() && num > minHeap.peek()){
                minHeap.offer(num);
                num = minHeap.poll();
            }
            maxHeap.offer(num);
        }
        count++;
    }
    public double getMedian(){
        if(count==0)
            throw new RuntimeException("no available number!");
        if ((count & 1) == 0)
            return new Double(minHeap.peek() + maxHeap.peek())/2;
        else
            return new Double(minHeap.peek());
    }
    public static void main(String[] args){
        S63_GetMedian s63 = new S63_GetMedian();
        Integer[] array = {5,2,3,4,1,6,7,0,8};
        for (int i=0;i<array.length;i++){
            s63.insert(array[i]);
            System.out.println(s63.getMedian());
        }
    }
}
