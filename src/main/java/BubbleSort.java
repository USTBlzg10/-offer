/**
 * @author LiuZhiguo
 * @date 2019/10/14 10:41
 */
public class BubbleSort {
    void bubbleSort(int[] R, int n){
        for (int i=n-1;i>=1;i--){
            int flag = 0;
            int temp;
            for (int j=1;j<=i;j++){
                if (R[j-1]>R[j]){
                    temp = R[j];
                    R[j] = R[j-1];
                    R[j-1] = temp;
                    flag =1;
                }
            }
            if (flag == 0)
                return;
        }
    }
    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        int[] R = {49,38,65,97,76,13,27,49};
        bubbleSort.bubbleSort(R, R.length);
        for (int i=0;i<R.length;i++)
            System.out.println(R[i]);
    }
}
