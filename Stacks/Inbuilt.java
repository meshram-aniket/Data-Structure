package Stacks;

import java.util.Stack;

public class Inbuilt {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);


        while(!s1.isEmpty()) {
            System.out.print(s1.peek()+" ");
            s1.pop();
        }

    }
}
