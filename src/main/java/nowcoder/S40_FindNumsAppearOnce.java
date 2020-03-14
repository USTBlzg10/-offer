package nowcoder;

import java.util.HashMap;

/**
 * @author LiuZhiguo
 * @date 2020/2/5 12:23
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class S40_FindNumsAppearOnce {
    public void findNumsAppearOnce(int[] array, int[] num1, int[] num2){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i=0;i<array.length;i++){
            if (hashMap.containsKey(array[i])){
                int count = hashMap.get(array[i]);
                hashMap.put(array[i], count+1);
            }
            else hashMap.put(array[i], 1);
        }
        for (int i=0;i<array.length;i++){
            if (hashMap.get(array[i]) == 1) {
                if (num1.length == 0)
                    num1[0] = array[i];
                else {
                    num2[0] = num1[0];
                    num1[0] = array[i];
                }
            }
        }
        System.out.println(num1[0]+","+num2[0]);
    }
    public static void main(String[] args){
        S40_FindNumsAppearOnce s40 = new S40_FindNumsAppearOnce();
        int[] array = {1, 2, 1, 2, 3, 3, 4, 5, 6, 4, 7, 6, 8, 7};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        s40.findNumsAppearOnce(array, num1,num2);
    }
}
