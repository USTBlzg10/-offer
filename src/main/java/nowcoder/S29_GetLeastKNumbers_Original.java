package nowcoder;

import java.util.ArrayList;

/**
 * @author LiuZhiguo
 * @date 2020/1/9 19:51
 * 用原本方法创建大根堆来实现
 */
public class S29_GetLeastKNumbers_Original {
    public void sift(int[] array,int low,int high){
        int i = low;
        int temp = array[i];
        int j = 2*i+1; //i的左孩子
        while (j <= high){
            if (j < high && array[j+1] > array[i])
                j++;
            if (temp < array[j]){
                array[i] = array[j];
                i = j;
                j = 2*i+1;
            }else
                break;
        }
        array[i] = temp;
    }
    public ArrayList<Integer> getLeastKNumbers(int[] input, int k){
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (input.length == 0 || k<= 0)
            return result;
        int[] numbers = new int[k];
        for (int i=0;i<k;i++)
            numbers[i]=input[i];
        //构建容量为k的大根堆
        for (int i=k/2-1;i>=0;i--)
            sift(numbers,i,k-1);
        for (int i=k;i<input.length;i++){
            if (numbers[0] > input[i]){
                numbers[0] = input[i];
                sift(numbers,0,k-1);
            }
        }
        for (int n:numbers)
            result.add(n);
        return result;
    }
    public static void main(String[] args){
        S29_GetLeastKNumbers_Original s29 = new S29_GetLeastKNumbers_Original();
        int[] input = {4,5,1,6,2,7,3,8};
        System.out.println(s29.getLeastKNumbers(input, 4));
    }
}
