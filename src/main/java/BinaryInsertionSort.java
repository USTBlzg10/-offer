/**
 * @author LiuZhiguo
 * @date 2019/10/14 9:55
 */
public class BinaryInsertionSort {
    public void binaryInsertionSort(int[] R, int n){
        for (int i=1;i<n;i++){
            int low=0;
            int mid;
            int temp = R[i];
            int high = i-1;
            while (high>=low){
                mid = (low+high)>>1;
                if (temp < R[mid])
                    high = mid -1;
                else low = mid+1;
            }
            if (i>high) {
                for (int j=i-1;j>=low;j--){
                    R[j+1] = R[j];
                }
            }
            R[low] = temp;
        }
    }
    public static void main(String[] args){
        BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort();
        int[] R = {49,38,65,97,76,13,27,49};
        binaryInsertionSort.binaryInsertionSort(R, R.length);
        for (int i=0;i<R.length;i++){
            System.out.println(R[i]);
        }
    }
}
