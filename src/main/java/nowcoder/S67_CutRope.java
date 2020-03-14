package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2020/2/20 12:39
 */
public class S67_CutRope {
    public int cutRope(int target){
        if (target < 2)
            return 0;
        if (target == 2)
            return 1;
        if (target == 3)
            return 2;
        int timesOf3 = target / 3;
        int timesOf2 = (target - timesOf3 * 3) / 2;
        return (int)(Math.pow(3, timesOf3)) * (int)(Math.pow(2, timesOf2));
    }
    public static void main(String[] args){
        S67_CutRope s67 = new S67_CutRope();
        System.out.println(s67.cutRope(8));
    }
}
