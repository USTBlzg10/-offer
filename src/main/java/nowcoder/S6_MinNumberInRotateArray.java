package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2019/12/17 15:24
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class S6_MinNumberInRotateArray {
    public int minNumberInRotateArray(int[] array) {
        int low=0;
        int high = array.length-1;
        int mid = -1;
        if (array.length == 0)
            return 0;
        while (array[low] >= array[high]){
            if (high - 1== low){
                mid = high;
                break;
            }
            mid = (low+high)>>1;
            if (array[mid] > array[0])
                low = mid;
            if (array[mid] < array[0])
                high = mid;
        }
        return array[mid];
    }
    public static void main(String[] args){
        S6_MinNumberInRotateArray s6 = new S6_MinNumberInRotateArray();
        int[] array = {3, 4, 5, 1, 2};
        System.out.println(s6.minNumberInRotateArray(array));
    }
}