package nowcoder;

import java.util.ArrayList;
import java.util.List;

public class FindNumsAppearOnce {
    public List FindNumsAppearOnce(int[] array, int num1[] , int num2[]) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<array.length;i++){
            if(!list.contains(Integer.valueOf(array[i]))){
                list.add(Integer.valueOf(array[i]));
            }else{
                list.remove(Integer.valueOf(array[i]));
            }
        }
        if(list.size()!=0){
            num1[0] = Integer.valueOf(list.get(0));
            num2[0] = Integer.valueOf(list.get(1));
        }
        return list;
    }
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 3, 4, 4, 5,6,6,7,7,8,9,9};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        FindNumsAppearOnce findNumsAppearOnce = new FindNumsAppearOnce();
        System.out.println(findNumsAppearOnce.FindNumsAppearOnce(array, num1, num2));
    }
}
