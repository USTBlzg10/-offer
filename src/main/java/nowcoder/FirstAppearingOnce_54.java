package nowcoder;
/**
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，
 * 第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 */
public class FirstAppearingOnce_54 {
    //Insert one char from stringstream
    int[] hash = new int[256];
    StringBuffer s = new StringBuffer();
    public void Insert(char ch) {
        s.append(ch);
        if (hash[ch]==0)
            hash[ch] = 1;
        else hash[ch] += 1;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        char[] str = s.toString().toCharArray();
        for (char chars : str) {
            if (hash[chars] ==1)
                return  chars;
        }
        return '#';
    }
    public static void main(String[] args) {
        FirstAppearingOnce_54 firstAppearingOnce_54 = new FirstAppearingOnce_54();
        String s = "machinelearning";
        char[] ch = s.toCharArray();
        for (int i=0;i<ch.length;i++) {
            char chara = ch[i];
            firstAppearingOnce_54.Insert(chara);
        }
        System.out.println(firstAppearingOnce_54.FirstAppearingOnce());
    }
}
