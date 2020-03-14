package nowcoder;

import java.util.ArrayList;

/**
 * @author LiuZhiguo
 * @date 2020/2/6 23:42
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
 * 使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class S42_FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (array.length == 0 || array == null)
            return list;
        int i = 0;
        int j = array.length-1;
        while (i < j){
            if (array[i] + array[j] == sum){
                list.add(array[i]);
                list.add(array[j]);
                return list;
            }
            else if (array[i] + array[j] > sum)
                j--;
            else i++;
        }
        return list;
    }
    public static void main(String[] args){
        S42_FindNumbersWithSum s42 = new S42_FindNumbersWithSum();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(s42.FindNumbersWithSum(array, 11));
    }
}
