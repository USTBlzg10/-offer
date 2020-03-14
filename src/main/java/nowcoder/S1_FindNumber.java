package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2019/6/26 21:21
 */
public class S1_FindNumber {
    public boolean Find(int target, int [][] array) {
        int m = array.length-1; //行数
        int n = array[0].length-1; //列数
        int i=m, j=0;
        while (i>=0 && j<=n) {
            if (target > array[i][j])
                j++;
            else if (target < array[i][j])
                i--;
            else return true;
        }
        return false;
    }
    public static void main(String[] args) {
        S1_FindNumber nk1_findNumber = new S1_FindNumber();
        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(nk1_findNumber.Find(13, array));
    }
}
