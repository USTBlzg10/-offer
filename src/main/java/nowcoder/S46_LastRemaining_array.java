package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2020/2/9 22:11
 */
public class S46_LastRemaining_array {
    public int lastRemainingUseArray(int n, int m){
        if (n <1 || m < 1)
            return -1;
        int[] array = new int[n];
        int count = n, step = 0, i =-1;
        while (count > 0){
            i++;
            if (i>=n) //走到数组末尾调回数组头，模拟环
                i=0;
            if (array[i] == -1)
                continue;
            step++;
            if (step == m){
                count--;
                array[i] = -1;
                step = 0;
            }
        }
        return i;
    }
    public static void main(String[] args){
        S46_LastRemaining_array s46_lastRemaining_array = new S46_LastRemaining_array();
        System.out.println(s46_lastRemaining_array.lastRemainingUseArray(10, 4));
    }
}
