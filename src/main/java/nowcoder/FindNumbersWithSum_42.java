package nowcoder;
import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class FindNumbersWithSum_42 {
    public ArrayList<Integer> FindNumberWithSum (int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (array == null || array.length ==0)
            return list;
        int i =0;
        int j = array.length-1;
        while (i != j) {
            if ((array[i] + array[j])==sum) {
                list.add(array[i]);
                list.add(array[j]);
                return list;
            }
            else if ((array[i] + array[j]) >sum)
                j--;
            else i++;
        }
        return list;
    }
    public static void main(String[] args) {
        FindNumbersWithSum_42 findNumbersWithSum_42 = new FindNumbersWithSum_42();
        int[] array ={};
        System.out.println(findNumbersWithSum_42.FindNumberWithSum(array, 0));
    }
}
