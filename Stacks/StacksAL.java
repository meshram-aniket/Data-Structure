package Stacks;

import java.util.ArrayList;
import java.util.Stack;

public class StacksAL {

    static class Stacks {
        ArrayList<Integer> list = new ArrayList<>();

        public void push(int value) {
            list.add(value);
        }


        public int pop() {
            return list.remove(list.size() - 1);
        }


        public int peek() {
            return list.get(list.size() - 1);
        }
    }



    public static void main(String[] args) {
        Stacks s1 = new Stacks();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);


        while(!s1.list.isEmpty()) {
            System.out.print(s1.peek());
            s1.pop();
        }
    }
}
