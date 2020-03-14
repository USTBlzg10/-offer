package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2019/9/25 10:44
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,
 * 要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 */
public class LeftRotateString_43 {
    public String LeftRotateString(String str,int n) {
        /*char[] array = str.toCharArray();
        int length = array.length;
        if (n > length)
            return "";
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=n;i<length;i++) {
            stringBuffer.append(array[i]);
        }
        for (int i=0;i<n;i++) {
            stringBuffer.append(array[i]);
        }
        return  stringBuffer.toString();*/
        int length = str.length();
        if (n > length)
            return "";
        str += str;
        return str.substring(n, length+n);
    }
    public static void main(String[] args) {
        LeftRotateString_43 leftRotateString_43 = new LeftRotateString_43();
        String str = "abcXYZdef";
        System.out.println(leftRotateString_43.LeftRotateString(str, 12));
    }
}
