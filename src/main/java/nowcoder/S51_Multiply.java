package nowcoder;
/**
 * @author LiuZhiguo
 * @date 2020/2/12 11:45
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。
 */
public class S51_Multiply {
    public int[] multiply(int[] A){
        int length = A.length;
        int[] B = new int[length];
        for (int i=0;i<length;i++){
            B[i] = preMultiply(A, i) * afterMultiply(A, i);
        }
        return B;
    }
    private int preMultiply(int[] A, int a){
        int pre = 1;
        for (int i=0;i<a;i++)
            pre *= A[i];
        return pre;
    }
    private int afterMultiply(int[] A, int a){
        int after = 1;
        for (int i=A.length-1;i>a;i--)
            after *= A[i];
        return after;
    }
    public static void main(String[] args){
        S51_Multiply s51 = new S51_Multiply();
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] res = s51.multiply(A);
        for (int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
    }
}
