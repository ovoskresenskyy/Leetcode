package LC_20_Valid_Parentheses;

import java.util.Stack;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(Solution.isValid("([{}])"));
    }
}

class Solution {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()){
                    return false;
                } else {
                    char topChar = stack.peek();
                    if (topChar == '(' && c != ')' || topChar == '[' && c != ']' || topChar == '{' && c != '}'){
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}