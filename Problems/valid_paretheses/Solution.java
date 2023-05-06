package valid_paretheses;

import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int openBrackets = 0;
        int closeBrackets = 0;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                openBrackets++;
            } else {
                closeBrackets++;
            }
            if (stack.isEmpty()) {
                return false;
            }
            if ((c == ')' && stack.peek() == '(')
                    || (c == '}' && stack.peek() == '{')
                    || (c == ']' && stack.peek() == '[')
            ) {
                stack.pop();
            }
        }

        return stack.size() == 0 && openBrackets == closeBrackets;
    }

    public static void main(String[] args) {
        String s = "(])";
        System.out.println(isValid(s));
    }
}
