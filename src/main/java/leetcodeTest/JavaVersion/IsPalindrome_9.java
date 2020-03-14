package leetcodeTest.JavaVersion;

/**
 * @author LiuZhiguo
 * @date 2019/11/11 8:53
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）
 * 和倒序（从右向左）读都是一样的整数。
 */
public class IsPalindrome_9 {
    public boolean isPalindrome_9(int x){
        /*String reversedStr = new StringBuilder(x+"").reverse().toString();
        return (x+"").equals(reversedStr);*/

        /*解法二
        if (x<0) return false;
        int div = 1;
        while (x/div>=10) div *=10;
        while (x>0){
            int left = x/div;
            int right = x%10;
            if (left!=right) return false;
            x = (x%div)/10;
            div /= 100;
        }
        return true;*/

        /*解法三
        char[] num = new StringBuilder(x+"").toString().toCharArray();
        int i=0, j=num.length-1;
        if (x<0) return false;
        while (i<j && num[i]==num[j]){
            ++i;
            --j;
        }
        if (num[i]!=num[j]) return false;
        return true;*/
        //解法四
        if (x<0 || (x%10==0 && x!=0)) return false;
        int y = 0;
        int revertNum =0;
        while (x > revertNum){
            revertNum = revertNum * 10 + x%10;
            x /= 10;
        }
        return x==revertNum || x == revertNum /10;
    }
    public static void main(String[] args){
        IsPalindrome_9 isPalindrome_9 = new IsPalindrome_9();
        System.out.println(isPalindrome_9.isPalindrome_9(121));
    }
}
