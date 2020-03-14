package leetcodeTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class S373_kSmallestPairs_new {
    public ArrayList<ArrayList<Integer>> kSmallestPairs(int[] num1, int[] num2, int k){
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        PriorityQueue<int[]> pQ = new PriorityQueue<int[]>(k, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return twoSum(o2)- twoSum(o1);
            }
        });
        int pre_n1 = 0x7fffffff;
        int pre_n2 = 0x7fffffff;
        for (int n1: num1)
            for (int n2: num2){
                if (n1 > pre_n1 && n2 > pre_n2)
                    break;
                int[] arr = new int[]{n1, n2};
                if (pQ.size() < k)
                    pQ.add(arr);
                else if (pQ.size() >=k && twoSum(arr)< twoSum(pQ.peek())){
                    pQ.poll();
                    pQ.add(arr);
                    pre_n1 = n1;
                    pre_n2 = n2;
                }
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
        S373_kSmallestPairs_new s373 = new S373_kSmallestPairs_new();
        int[] num1 = {1,7,11};
        int[] num2 = {2,4,6};
        System.out.println(s373.kSmallestPairs(num1, num2, 3));
    }
}
