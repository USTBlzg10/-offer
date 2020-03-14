package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2020/2/5 12:23
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class S40_FindNumsAppearOnce_new {
    public void findNumsAppearOnce(int[] array, int[] num1, int[] num2){
        if (array.length == 2){
            num1[0] = array[0];
            num1[1] = array[1];
        }
        int bitResult = 0;
        for (int i=0;i<array.length;i++){
            bitResult ^= array[i];
        }
        int index = findFirst1(bitResult);
        for (int i=0;i<array.length;i++){
            if (isBit1(array[i], index))
                num1[0] ^= array[i];
            else num2[0] ^= array[i];
        }
        System.out.println(num1[0]+","+num2[0]);
    }
    //找到所有树异或后最后一个数的二进制的第一个1的位置
    public int findFirst1(int bitResult){
        int index = 0;
        while ((bitResult & 1) == 0 && index< 32){
            index++;
            bitResult >>= 1;
        }
        return index;
    }
    public boolean isBit1(int target, int index) {
        return (target >> index & 1) == 1;
    }
    public static void main(String[] args){
        S40_FindNumsAppearOnce_new s40 = new S40_FindNumsAppearOnce_new();
        int[] array = {2, 4, 3, 6, 3, 2, 5, 5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        s40.findNumsAppearOnce(array, num1,num2);
    }
}
