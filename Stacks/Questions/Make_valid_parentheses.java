package Stacks.Questions;
import java.util.*;

public class Make_valid_parentheses {
    public static void main(String[] args) {
        Make_valid_parentheses m = new Make_valid_parentheses();
        String s = "(()))";
        System.out.println(m.minAddToMakeValid(s));
    }

    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()) {
            if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
                else {
                    stack.push(ch);
                }
            }
            else {
                stack.push(ch);
            }
        }
        return stack.size();
    }
}
