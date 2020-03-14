/**
 * @author LiuZhiguo
 * @date 2019/10/11 20:14
 */
public class InsertSort {
    void insertSort(int R[], int n){
        int i, j;
        int temp;
        for (i=1;i<n;i++){
            temp = R[i];
            j = i-1;
            while (j >=0 && temp < R[j]){
                R[j+1] = R[j];
                j--;
            }
            R[j+1] = temp;
        }
    }
    public static void main(String[] args){
        InsertSort insertSort = new InsertSort();
        int[] R = {49,38,65,97,76,13,27,49};
        insertSort.insertSort(R, R.length);
        for (int i=0;i<R.length;i++) {
            System.out.println(R[i]);
        }
    }
}
