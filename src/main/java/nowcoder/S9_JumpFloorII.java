package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2019/12/20 21:11
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class S9_JumpFloorII {
    public int jumpFloorII(int number){
        if (number <= 0)
            return -1;
        else if (number == 1)
            return 1;
        else
            return 1 << (number-1);
    }
    public static void main(String[] args){
        S9_JumpFloorII s9 = new S9_JumpFloorII();
        System.out.print(s9.jumpFloorII(4));
    }
}
