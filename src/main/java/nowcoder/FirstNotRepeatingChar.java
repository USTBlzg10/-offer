package nowcoder;

public class FirstNotRepeatingChar {
    public int firstNotRepeatingChar(String str) {
        int[] words = new int[58];
        for (int i=0;i<str.length();i++){
            words[(int)str.charAt(i)-65] +=1;
        }
        for (int i=0;i<str.length();i++) {
            if (words[(int)str.charAt(i)-65] ==1)
                //System.out.println(str.charAt(i));
                return i;
        }
        return -1;
    }
    public static void  main(String[] args){
        FirstNotRepeatingChar firstNotRepeatingChar = new FirstNotRepeatingChar();
        String str ="skdlfjksljflbjalkfhisahdfjlak";
        int i =firstNotRepeatingChar.firstNotRepeatingChar(str);
        System.out.println(str.charAt(i));
        System.out.println(i);
    }
}
