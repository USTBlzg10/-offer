package nowcoder;

public class GetNumberOfK {
    public int GetNumberOfK(int [] array, int k){
            int sum = 0;
            int position = getPositionOfK(array, k, 0, array.length-1);
            if (position == -1)
                return 0;
            System.out.println(position);
            if (array[position] == array[array.length-1]) //最后一个元素是k直接返回 array.length-position
                return array.length-position;
            else {
                while (array[position] == k && position<array.length) {
                    ++sum;
                    ++position;
                }
            }
            return sum;
        }
        public int getPositionOfK(int [] array, int k , int low, int high){
            if (low > high)
                return -1;
            int mid = (low + high) >> 1;
            if (array[mid] > k)
                return getPositionOfK(array, k, low, mid-1);
            else if (array[mid] < k)
                return getPositionOfK(array, k, mid+1, high);
            else if (mid-1 >=0 && array[mid-1]==k)
                return getPositionOfK(array, k, low, mid-1);
            else
                return mid;
        }
    public static void main(String[] args){
        GetNumberOfK getNumberOfK = new GetNumberOfK();
        int [] array = {3,3,3,3};
        int result = getNumberOfK.GetNumberOfK(array, 3);
        System.out.println(result);
    }
}
