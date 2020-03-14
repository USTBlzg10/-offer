/**
 * @author LiuZhiguo
 * @date 2019/10/1 16:31
 */
public class SelectSort {
    public static void selectSort(int[] arr, int n) {
        int i, j, mini;
        int temp;
        for (i=0;i<n;i++) {
            mini =i;
            for (j=i+1;j<n;j++) {
                if (arr[mini] > arr[j])
                    mini = j; //mini记录当前比较过程中最小值的下标
            }
            if (i != mini){
                temp = arr[i];
                arr[i] = arr[mini];
                arr[mini] =temp;
            }
        }
    }
    public static void main(String[] args) {
        //SelectSort selectSort = new SelectSort();
        int[]arr = {2,5,1,10,4,7,12,13,6,11,21,18,12};
        selectSort(arr, arr.length);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
