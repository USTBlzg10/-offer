package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2020/1/31 11:58
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。
 * 并将P对1000000007取模的结果输出。 即输出P%1000000007
 */
public class S35_InversePairs {
    public int InversePairs(int[] array){
        int length = array.length;
        int[] copy = new int[length];
        for (int i=0;i<length;i++){
            copy[i] = array[i];
        }
        return inversePairsCore(array, copy, 0, length-1);
    }
    private static int inversePairsCore(int[] array, int[] copy, int start, int end){
        if (start == end)
            return 0;
        int mid = (start + end) >> 1;
        int left = inversePairsCore(copy, array, start, mid);
        int right = inversePairsCore(copy, array,mid+1, end);
        int count = 0;
        int i = mid;//i初始化为前半段最后一个数的下标
        int j = end;//j初始化为后半段最后一个数的下标
        int indexcopy = end;
        while (i >= start && j >= mid+1){
            if (array[i] > array[j]){
                count += j - mid;
                copy[indexcopy--] = array[i--];//将较大数复制到copy数组中
                if (count > 1000000007)
                    count %= 1000000007;
            }
            else {
                copy[indexcopy--] = array[j--];
            }
        }
        //i或j有一个不满足上面循环就将另外一半链到copy数组
        for (;i>=start;i--)
            copy[indexcopy--] = array[i];
        for (;j>=mid+1;j--)
            copy[indexcopy--] = array[j];
        return (left+right+count)%1000000007;
    }
    public static void main(String[] args){
        S35_InversePairs s35 = new S35_InversePairs();
        int[] array = {364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,
                355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,
                746,550,474,162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,
                983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,
                433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575};
        System.out.println(s35.InversePairs(array));
    }
}
