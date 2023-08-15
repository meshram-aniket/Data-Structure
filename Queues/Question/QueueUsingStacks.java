package Queues.Question;

import java.beans.PropertyEditorManager;
import java.util.*;

public class QueueUsingStacks {
    public static void main(String[] args) {
//        Queue<Integer> q = new LinkedList<>();
//        q.add(5);
//        q.add(6);
//        q.add(7);


        Queues q = new Queues();
        q.insert(5);
        q.insert(6);

        while (!q.isEmpty()) {
            System.out.print(q.removes() + " ");

        }
        System.out.println("end");

        System.out.println(q.removes());
   }

    static class Queues {
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

        public int removes() {
            if (isEmpty()) {
                return -1;
            }
            return s1.pop();
        }


        public int front() {
            if (isEmpty()) {
                return -1;
            }

            return s1.peek();
        }

        public boolean isEmpty() {
            return s1.isEmpty();
        }
    }
}
