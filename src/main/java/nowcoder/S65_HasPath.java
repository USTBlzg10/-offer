package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2020/2/19 11:53
 */
public class S65_HasPath {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        boolean[] flag = new boolean[matrix.length];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (judge(matrix, i, j, rows, cols, str, flag,0))
                    return true;
            }
        }
        return false;
    }
    //judge方法（矩阵，i， j，行数，列数，需匹配的字符串，是否走过标志，判断的第k个）
    private boolean judge(char[] matrix, int i, int j, int rows, int cols, char[] str, boolean[] flag, int k){
        int index = i * cols + j;
        if (i< 0 || j< 0 || i>=rows || j >= cols || matrix[index] != str[k] || flag[index] == true)
            return false;
        //如果k走到str的最后一位，说明匹配成功
        if (k == str.length-1)
            return true;
        //要走的第一个位置flag置为true，表示走过了
        flag[index] = true;
        //回溯，每次找到了就k+1，否则倒回一步
        if (judge(matrix, i-1, j, rows, cols, str, flag, k+1)||
        judge(matrix, i+1, j, rows, cols, str, flag, k+1)||
        judge(matrix, i, j-1, rows, cols, str, flag, k+1)||
        judge(matrix, i, j+1, rows, cols, str, flag, k+1)){
            return true;
        }
        //走到这一步说明周围的没有找到，回退一步,试其他路径
        flag[index] = false;
        return false;
    }
    public static void main(String[] args){
        S65_HasPath s65 = new S65_HasPath();
        char[] matrix = {'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e'};
        char[] str = {'b', 'c', 'c', 'e', 'd'};
        char[] strs = {'a', 'b', 'c', 'b'};
        System.out.println(s65.hasPath(matrix,3,4,str));
        System.out.println(s65.hasPath(matrix,3,4,strs));
    }
}
