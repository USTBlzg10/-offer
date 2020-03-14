package nowcoder;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 * */
import java.util.ArrayList;
public class Multiply {
    /*public int[] multiply(int[] A) {
        int length = A.length;
        int[] B =new int[length];
        for (int i=0;i<length;i++) {
            B[i] = preMultiply(A, i) * afterMultiply(A, i);
        }
        return B;
    }
    private int preMultiply(int[] A, int number) {
        int pre =1;
        for (int i=0;i<number;i++){
            pre *= A[i];
        }
        //System.out.println(pre);
        return pre;
    }
    private int afterMultiply(int[] A, int number) {
        int length = A.length;
        int after=1;
        if (number==length) {
            after = 1;
        }
        else {
            for (int i = length-1;i>number;i--)
                after *= A[i];
        }
        //System.out.println(after);
        return after;
    }*/
    public int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        if(length != 0 ){
            B[0] = 1;
            //计算下三角连乘
            for(int i = 1; i < length; i++){
                B[i] = B[i-1] * A[i-1];
            }
            int temp = 1;
            //计算上三角
            for(int j = length-2; j >= 0; j--){
                temp *= A[j+1];
                B[j] *= temp;
            }
        }
        return B;
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9};
        Multiply multiply = new Multiply();
        int[] B =multiply.multiply(A);
        //System.out.println(multiply.preMultiply(A, 3));
        //System.out.println(multiply.afterMultiply(A, 3));
        System.out.println(B);
    }
}
