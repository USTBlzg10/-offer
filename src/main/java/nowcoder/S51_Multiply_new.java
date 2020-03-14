package nowcoder;
/**
 * @author LiuZhiguo
 * @date 2020/2/12 11:45
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。
 */
public class S51_Multiply_new {
    public int[] multiply(int[] A){
        int length = A.length;
        int[] B = new int[length];
        for (int i=0;i<length;i++){
            int temp = A[i];
            B[i] = 1;
            for (int j=0;j<length;j++){
                A[i] = 1;
                B[i] *= A[j];
            }
            A[i] = temp;//还原A[i],否则A[i]就是1了
        }
        return B;
    }
    public static void main(String[] args){
        S51_Multiply_new s51 = new S51_Multiply_new();
        int[] A = {1, 2, 3, 4};
        int[] res = s51.multiply(A);
        for (int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
    }
}
