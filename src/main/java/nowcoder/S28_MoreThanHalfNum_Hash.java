package nowcoder;

import java.util.HashMap;

public class S28_MoreThanHalfNum_Hash {
    public int moreThanHalfNum(int[] array){
        if (array.length==0)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<array.length;i++){
            Integer count = map.get(array[i]);
            if (count == null){
                map.put(array[i],1);
                count = 0;
            }
            else
                map.put(array[i],count+1);
            if (count+1 >array.length/2)
                return array[i];
        }
        return 0;
    }
    public static void main(String[] args){
        S28_MoreThanHalfNum_Hash s28 = new S28_MoreThanHalfNum_Hash();
        int[] array = {1,2,3,2,2,2,5,4,2};
        int result = s28.moreThanHalfNum(array);
        System.out.println(result);
    }
}
