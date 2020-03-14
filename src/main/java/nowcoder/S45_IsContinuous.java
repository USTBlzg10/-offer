package nowcoder;

import java.util.Arrays;

/**
 * @author LiuZhiguo
 * @date 2020/2/8 12:24
 * 判断扑克牌是否为顺子
 */
public class S45_IsContinuous {
    public boolean isContinuous(int[] numbers){
        if (numbers == null || numbers.length == 0){
            return false;
        }
        int zeroNum = 0;//记录王的个数
        int count = 0;//记录排序后相邻两个数之间的间隔
        //将数组排序
        Arrays.sort(numbers);
        for (int i=0;i<numbers.length;i++){
            if (numbers[i] == 0)
                zeroNum++;
            if (numbers[i] != 0)
                break;
        }
        for (int i=zeroNum+1;i<numbers.length;i++){
            if (numbers[i] == numbers[i-1] )
                return false;
            count += numbers[i] - numbers[i-1] -1;
        }
        if(zeroNum >= count)
            return true;
        else return false;
    }
    public static void main(String[] args){
        S45_IsContinuous s45 = new S45_IsContinuous();
        int[] array = {1, 3, 0, 0, 7, 5, 2};
        System.out.println(s45.isContinuous(array));
    }
}
