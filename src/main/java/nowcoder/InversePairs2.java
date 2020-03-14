package nowcoder;

public class InversePairs2 {

    public static int InversePairs(int [] array) {
        if (array ==null || array.length == 0)
            return 0;
        int [] copy = new int[array.length];
        for (int i = 0;i< array.length;i++){
            copy[i] = array[i];
        }
        return InversePairsCore(array, copy, 0, array.length-1) ;
    }
    private static int InversePairsCore(int[] array, int[] copy, int begin, int end)  {
        if (begin == end) {
            return 0;
        }
        int mid = (end + begin) >>1;
        int leftCount = InversePairsCore(array, copy, begin, mid) % 1000000007;
        int rightCount= InversePairsCore(array, copy, mid+1, end) % 1000000007;
        int count = 0; //计数
        int i = mid; //i初始化为前半段最后一个数字的下标
        int j = end; //j初始化为后半段最后一个数字的下标
        int indexcopy = end; //辅助数组复制的数组的最后一个数字的下标
        while (i >= begin && j>= mid +1) {
            if (array[i] > array[j]) {
                count += j - mid;
                copy[indexcopy--] = array[i--]; //将较大值放到copy数组后端，覆盖原值
                if (count >=1000000007)
                    count %= 1000000007;
            }
            else
                copy[indexcopy--] = array[j--];
        }
        for (;i >=begin;i--) {
            copy[indexcopy--] = array[i];
        }
        for (;j >= mid +1;j--) {
            copy[indexcopy--] = array[j];
        }
        for (int s = begin;s<=end;s++)
            array[s] = copy[s];
        return (leftCount + rightCount + count) % 1000000007;
    }

    public static void main(String[] args){
        InversePairs2 inversePairs2 = new InversePairs2();
        //long startime =System.currentTimeMillis();
        int[] array = {364,637,341,406,747,995,234,971,571,219,993,407,416,366,315,301,601,650,418,
                355,460,505,360,965,516,648,727,667,465,849,455,181,486,149,588,233,144,174,557,67,
                746,550,474,162,268,142,463,221,882,576,604,739,288,569,256,936,275,401,497,82,935,
                983,583,523,697,478,147,795,380,973,958,115,773,870,259,655,446,863,735,784,3,671,
                433,630,425,930,64,266,235,187,284,665,874,80,45,848,38,811,267,575};
        //int[] array = {1,2,3,4,5,6,7,0};
        long result = inversePairs2.InversePairs(array);
        System.out.println(result);
        //long endtime = System.currentTimeMillis();
        //System.out.println((endtime-startime));
    }
}
