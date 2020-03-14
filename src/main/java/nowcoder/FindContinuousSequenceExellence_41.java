package nowcoder;

import java.util.ArrayList;

/**
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 */
public class FindContinuousSequenceExellence_41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int low=1, high=2;
        while (high>low) {
            int cur = (low+high)*(high-low+1)>>1;
            if (cur == sum) {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                for (int i=low;i<=high;i++) {
                    temp.add(i);
                }
                list.add(temp);
                low++;
            }
            else if (cur <sum)
                high++;
            else low++;
        }
        return list;
    }
    public static void main(String[] args) {
        FindContinuousSequenceExellence_41 findContinuousSequence_41 = new FindContinuousSequenceExellence_41();
        ArrayList<ArrayList<Integer>> list = findContinuousSequence_41.FindContinuousSequence(100);
        System.out.println(list);
    }
}
