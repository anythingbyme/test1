package alg.stack;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty() || s.length() == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                //if opening parentheses, push to stack
                stack.push(c);
            }
            else {
                if (stack.empty()) return false;
                char top = stack.peek(); ////if closing parentheses
                if (top == '[' && c == ']' ||
                        top == '(' && c == ')' ||
                        top == '{' && c == '}'
                ) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
