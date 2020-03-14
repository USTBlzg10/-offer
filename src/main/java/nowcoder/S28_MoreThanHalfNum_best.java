package nowcoder;
/*
* 从左到右遍历数组，第一个数的count为1，后面的数和前面的数相同就count++，否则count--，
* 当count=0时，重新记录，新的这个数使得count=1，重复上述过程，最后count不等于0即存在这样的数
* */
public class S28_MoreThanHalfNum_best {
    public int moreThanHalfNum(int[] array){
        if (array.length==0)
            return 0;
        int result = array[0];
        int count = 1;
        for (int i=1;i<array.length;i++){
            if (count == 0){
                result = array[i];
                count =1;
            }
            else {
                if (array[i]==result)
                    count++;
                else
                    count--;
            }
        }
        count = 0;
        for (int i=0;i<array.length;i++){
            if (array[i] == result)
                count++;
        }
        if (2*count > array.length)
            return result;
        else return 0;
    }
    public static void main(String[] args){
        S28_MoreThanHalfNum_best s28 = new S28_MoreThanHalfNum_best();
        int[] array = {1,2,2,2,3};
        int result = s28.moreThanHalfNum(array);
        System.out.println(result);
    }
}
