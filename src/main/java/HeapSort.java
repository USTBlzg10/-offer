import java.util.ArrayList;
/**
 * @author LiuZhiguo
 * @date 2019/6/16 15:18
 */
public class HeapSort {
    public static void sift(int[] R, int low, int high) {
        if (high < low)
            return;
        int i=low, j=2*i;
        int temp = R[i];
        while (j <= high) {
            if (j < high &&R[j] < R[j+1])
                ++j;
            if (temp < R[j]) {
                R[i] = R[j];
                i = j;
                j = 2 * i;
            }
            else
                break;
        }
        R[i] = temp;
    }
    public ArrayList<Integer> heapSort(int R[], int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i;
        int n = R.length;
        for (i = k/2;i>=0;--i)
            sift(R, i, k-1);
        for (i =k;i <n;i++) {
            if (R[i] < R[0]){
                R[0] = R[i];
                sift(R, 0, k-1);
            }
        }
        for (int j=0;j<k;j++){
            list.add(R[j]);
        }
        return list;
    }
    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] R = {1, 2, 3, 9, 8, 7, 6, 5, 4};
        System.out.println(heapSort.heapSort(R, 3));
    }
}
