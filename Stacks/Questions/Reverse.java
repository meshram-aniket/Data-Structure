package Stacks.Questions;

import java.util.Stack;

public class Reverse {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {

    }

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);


//        reverse(stack);
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
