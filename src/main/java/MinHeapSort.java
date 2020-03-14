/**
 * @author LiuZhiguo
 * @date 2019/10/1 17:01
 */
public class MinHeapSort {
    public static void sift(int[] R, int low, int high) {
        int i=low, j=2*i;
        int temp = R[i];
        while (j <= high) {
            if (j < high &&R[j] > R[j+1])
                ++j;
            if (temp > R[j]) {
                R[i] = R[j];
                i = j;
                j = 2 * i;
            }
            else
                break;
        }
        R[i] = temp;
    }
    static int heapSort(int R[], int n, int k) {
        int i;
        for (i = n/2;i>=1;--i)
            sift(R, i, n);
        for (i =1;i <k;++i) {
            sift(R,i+1, n);
        }
        return R[k];
    }
    public static void main(String[] args) {
        int[] R = {10000000,1,2,3,4,5,6,7,8,9,10,11,12,13};
        System.out.println(heapSort(R, R.length-1,3));
    }
}
