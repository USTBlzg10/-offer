package nowcoder;

import java.util.ArrayList;

/**
 * @author LiuZhiguo
 * @date 2020/2/6 11:43
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。没多久,
 * 他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S
 * 的连续正数序列? Good Luck!
 */
public class S41_FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if (sum <= 1)
            return list;
        for (int i=1;i<sum;i++){
            int number = i;
            int j = i +1 ;
            while (number < sum){
                number += j;
                if (j < sum)
                    j++;
            }
            if (number == sum){
                ArrayList<Integer> tmp = new ArrayList<Integer>();
                for (int a=i;a<j;a++){
                    tmp.add(a);
                }
                list.add(tmp);
            }
        }
        return list;
    }
    public static void main(String[] args){
        S41_FindContinuousSequence s41 = new S41_FindContinuousSequence();
        System.out.println(s41.FindContinuousSequence(100));
    }
}
