package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2020/2/4 12:46
 */
public class S37_GetNumberOfK {
    public int GetNumberOfK(int[] array, int k){
        int position = getPosition(array, k, 0, array.length-1);
        System.out.println(position);
        if (position == -1)
            return 0;
        //sum记录k的数量
        int sum=0;
        for (int i=position;i<array.length;i++){
            if (array[i] == k)
                sum++;
            else break;
        }
        return sum;
    }
    //找到第一个k的位置
    public int getPosition(int[] array, int k, int start, int end){
        if (start > end)
            return -1;
        int mid = (start + end) >> 1;
        if (array[mid] > k)
            return getPosition(array, k, start, mid-1);
        else if (array[mid] < k)
            return getPosition(array, k, mid+1, end);
        //若mid前的数值也等于k
        else if (mid-1 >= 0 && array[mid-1] == k)
            return getPosition(array, k, start, mid-1);
        else return mid;
    }
    public static void main(String[] args){
        S37_GetNumberOfK s37 = new S37_GetNumberOfK();
        int[] array = {1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 6, 7, 8, 8};
        System.out.println(s37.GetNumberOfK(array, 5));
    }
}
