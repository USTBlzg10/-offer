package nowcoder;
/**
 * @author LiuZhiguo
 * @date 2020/2/19 18:30
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */
public class S66_MovingCount {
    public int movindCount(int threshold, int rows, int cols){
        int[][] flag = new int[rows][cols];
        return moving(threshold, flag, rows, cols, 0, 0);
    }
    public int moving(int threshold, int[][] flag, int rows, int cols, int i, int j){
        if (i>=rows || j >= cols || i<0 || j<0 || threshold <0 || sum(i, j) > threshold || flag[i][j] ==1)
            return 0;
        flag[i][j] = 1;
        return moving(threshold, flag, rows, cols, i-1, j)+
                moving(threshold, flag, rows, cols, i+1, j)+
                moving(threshold, flag, rows, cols, i, j-1)+
                moving(threshold, flag, rows, cols, i, j+1)+1;
    }
    public int sum(int i, int j){
        if (i < 0 || j <0)
            return 0;
        int sum = 0;
        while (i>0 && j>0){
            sum += i%10;
            i = i/10;
            sum += j%10;
            j = j/10;
        }
        return sum;
    }
    public static void main(String[] args){
        S66_MovingCount s66 = new S66_MovingCount();
        System.out.println(s66.movindCount(2, 4, 4));
    }
}
