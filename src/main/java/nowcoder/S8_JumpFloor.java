package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2019/12/18 16:22
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
//此问题就是斐波那契问题，
public class S8_JumpFloor {
    public int JumpFloor(int target) {
        if (target < 0)
            return -1;
        if (target < 2)
            return target;
        int num1=0; int num2 =1;
        int current = 1;
        for (int i=1;i<target;i++){
            current = num1 + num2;
            num1 = num2;
            num2 = current;
        }
        return current;
        //return JumpFloor(target-1) + JumpFloor(target-2);
    }
    public static void main(String[] args){
        S8_JumpFloor s8 = new S8_JumpFloor();
        System.out.println(s8.JumpFloor(10));
    }
}
