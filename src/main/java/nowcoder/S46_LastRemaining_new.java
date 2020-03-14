package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2020/2/9 22:23
 */
public class S46_LastRemaining_new {
    public int lastRemaining_new(int n, int m){
        if (n <1 || m< 1)
            return -1;
        int lastPosition = 0;
        for (int i=2;i<=n;i++){
            lastPosition = (lastPosition + m)%i;
        }
        return lastPosition;
    }
    public static void main(String[] args){
        S46_LastRemaining_new s46_lastRemaining_new = new S46_LastRemaining_new();
        System.out.println(s46_lastRemaining_new.lastRemaining_new(10, 4));
    }
}
