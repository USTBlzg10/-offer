package nowcoder;

import java.util.ArrayList;

/**
 * @author LiuZhiguo
 * @date 2019/12/27 20:18
 */
public class S19_PrintMatrix {
    public ArrayList<Integer> printMatrix(int[][] matrix){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int rows = matrix.length; //矩阵行数
        if (rows == 0)
            return result;
        int columns = matrix[0].length; //矩阵列数
        if (columns==0)
            return result;
        int cycles = ((rows < columns?rows:columns)-1)/2 +1; //圈数
        for (int i=0;i<cycles;i++){
            for (int k=i;k<columns-i;k++) //左到右
                result.add(matrix[i][k]);
            for (int j=i+1;j<rows-i;j++) //上到下；
                result.add(matrix[j][columns-1-i]);
            for (int k=rows-2-i;k>=i;k--) //右到左
                result.add(matrix[rows-1-i][k]);
            for (int j=rows-2-i;j>i;j--) //下到上
                result.add(matrix[j][i]);
        }
        return result;
    }
    public static void main(String[] args){
        S19_PrintMatrix s19 = new S19_PrintMatrix();
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        ArrayList<Integer> result = s19.printMatrix(matrix);
        System.out.println(result);
    }
}
