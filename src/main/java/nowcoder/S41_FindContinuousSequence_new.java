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
public class S41_FindContinuousSequence_new {
    //采用双指针方法
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int pLow = 1;
        int pHigh = 2;
        while (pHigh > pLow){
            int cur = (pLow+pHigh)*(pHigh-pLow+1)/2;//当前双指针中数字之和
            if (cur == sum){
                ArrayList<Integer> tmp = new ArrayList<Integer>();
                for (int i=pLow;i<=pHigh;i++){
                    tmp.add(i);
                }
                list.add(tmp);
                pLow++;
            }
            else if (cur<sum)
                pHigh++;
            else pLow++;
        }
        return list;
    }
    public static void main(String[] args){
        S41_FindContinuousSequence_new s41 = new S41_FindContinuousSequence_new();
        System.out.println(s41.FindContinuousSequence(100));
    }
}
