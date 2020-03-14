package nowcoder;

import java.util.Arrays;

/**
 * @author LiuZhiguo
 * @date 2020/1/9 10:30
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class S28_MoreThanHalfNum {
    public int moreThanHalfNum(int[] array){
        if (array == null || array.length == 0)
            return 0;
        Arrays.sort(array);
        int mid = array[array.length>>1];
        int number = array[mid];
        int count = 0;//统计中位数的个数
        for (int i=0;i<array.length;i++){
            if (array[i] == number)
                count++;
        }
        if (count>array.length/2)
            return number;
        else return 0;
    }
    public static void main(String[] args){
        S28_MoreThanHalfNum s28 = new S28_MoreThanHalfNum();
        int[] array = {1,2,3,2,2,2,5,4,2};
        int result = s28.moreThanHalfNum(array);
        System.out.println(result);
    }
}
