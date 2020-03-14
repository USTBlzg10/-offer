package leetcodeTest.JavaVersion;

import java.util.Stack;

public class ValidParenthesis_20 {
    public boolean validParenthesis (String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (int i =0;i<chars.length;i++) {
            if (stack.size() == 0)
                stack.push(chars[i]);
            else if (isValidCouple(stack.peek(), chars[i]))
                stack.pop();
            else stack.push(chars[i]);
        }
        return stack.empty();
    }
    private boolean isValidCouple(char c1, char c2) {
        return c1=='('&&c2==')' || c1=='['&&c2==']'|| c1=='{'&&c2=='}';
    }
    public static void main(String[] args) {
        ValidParenthesis_20 validParenthesis = new ValidParenthesis_20();
        String s = "[][]()(){}{}";
        boolean b = validParenthesis.validParenthesis(s);
        System.out.println(b);
    }
}
