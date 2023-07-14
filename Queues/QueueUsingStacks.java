package Queues;

import java.util.Stack;

public class QueueUsingStacks {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.insert(6);
        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.front());

    }

    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public void insert(int item) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(item);

            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            return s1.pop();
        }


        public int front() {
            if (s1.isEmpty()) {
                return -1;
            }

            return s1.peek();
        }

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public void display() {
            while(!s1.isEmpty()) {
                System.out.print(s1.peek()+" -> ");
                s1.pop();
            }
            System.out.println("end");

        }
    }

}
