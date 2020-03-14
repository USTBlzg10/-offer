package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2019/12/24 19:37
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class S13_reOrderArray {
    //利用直接插入排序的思想
    public void reOrderArray(int[] array){
        int n = array.length;
        int i=0;
        while (i<n){
            if (array[i]%2 ==1)
                i++; //i记录前面第一个偶数的下标
            else {
                int j=i+1;
                while (j<n && array[j]%2==0)
                    j++;
                if (j >= n)
                    break;
                int temp = array[j]; //找到又一个奇数
                while (j > i) {
                    array[j] = array[j-1];
                    j--;
                }
                array[i] = temp;
                i ++;
            }
        }
    }
    public static void main(String[] args){
        S13_reOrderArray s13 = new S13_reOrderArray();
        int[] arr = {1,2,4,6,8,5,7,9};
        s13.reOrderArray(arr);
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
