package Queues;
import java.util.*;
public class QueueInbuilt {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q);
        System.out.println(q.remove());
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

