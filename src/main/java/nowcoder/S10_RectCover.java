package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2019/12/23 16:14
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class S10_RectCover {
    public int rectCover(int target){
        if (target <= 0)
            return 0;
        else if (target <= 2)
            return target;
        //递归的方法
       /* else
            return rectCover(target-1)+rectCover(target-2);*/
        //迭代的方法
        int f = 2; int g = 1;
        while (--target > 0){
            f = f + g;
            g = f - g;
        }
        return g;
    }
    public static void main(String[] args){
        S10_RectCover s10 = new S10_RectCover();
        System.out.print(s10.rectCover(10));
    }
}
