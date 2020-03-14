package nowcoder;

import java.util.Arrays;

/**
 * @author LiuZhiguo
 * @date 2019/9/26 9:30
 * LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
 * 他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！
 * “红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,他想了想,决定大\小 王可以看成任何数字,
 * 并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。
 * LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何，
 * 如果牌能组成顺子就输出true，否则就输出false。为了方便起见,你可以认为大小王是0。
 */

/**
 * 假设int[] numbers = {1,6,0,7,0,2,4,0,0,10}，先统计0的个数用count来记录，
 * 然后将数组进行直接插入排序，并复制保留非0的数组部分，用num记录，num={1,2,4,6,7,10}
 * 从num的最后一个元素和前边的做差，10-7=3，count = count-2，相当于用掉了两个王，循环来做
 * 若最后count >=0，那就说明王的个数足够用，返回true，否则王的个数不够用，返回false
 */
public class IsContinuous_45 {
    public boolean isContinuous (int[] numbers){
        int length = numbers.length;
        int count = 0; //记录0的个数
        if (length == 0 || numbers==null)
            return false;
        for (int i=0;i<length;i++) {
            if (numbers[i] ==0) {
                count++;
                numbers[i] = 14; //将0都置为14，便于排序
            }
        }
        /*for (int i=1;i<numbers.length;i++) {
            int temp = numbers[i];
            int j=i-1;
            while (j>=0 && numbers[j]>temp) {
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = temp;
        }*/
        Arrays.sort(numbers);
        int[] num = Arrays.copyOf(numbers, length-count);
        for (int i=num.length-1;i>0;i--) {
            int difference = num[i]-num[i-1];
            if (difference == 0)
                return false;
            if (difference >1) {
                count -= difference-1;
            }
        }
        if (count >= 0)
            return true;
        else return false;
    }
    public static void main(String[] args) {
        IsContinuous_45 isContinuous_45 = new IsContinuous_45();
        int[] numbers = {5,2,3,1,0};
        System.out.println(isContinuous_45.isContinuous(numbers));
    }
}
