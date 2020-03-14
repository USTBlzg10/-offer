package nowcoder;

/**
 * @author LiuZhiguo
 * @date 2020/2/13 20:35
 */
public class S54_FirstAppearOnce {
    int[] hash = new int[256];
    StringBuffer sb = new StringBuffer();
    public void insert(char ch){
        sb.append(ch);
        if (hash[ch] == 0)
            hash[ch] = 1;
        else hash[ch] += 1;
    }
    public char firstAppearOnce(){
        char[] str = sb.toString().toCharArray();
        for (char chars : str){
            if (hash[chars] == 1)
                return chars;
        }
        return '#';
    }
    public static void main(String[] args){
        S54_FirstAppearOnce s54 = new S54_FirstAppearOnce();
        String str = "google";
        char[] ch = str.toCharArray();
        for (int i=0;i<str.length();i++){
            s54.insert(ch[i]);
        }
        System.out.println(s54.firstAppearOnce());
    }
}
