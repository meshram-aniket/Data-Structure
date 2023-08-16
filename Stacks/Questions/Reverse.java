package Stacks.Questions;

import java.util.Stack;

public class Reverse {
    public static void reverse(Stack<Integer> stack) {
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " -> ");
        }
        System.out.println("start");
    }

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverse(stack);
    }
}
