package LinkList.Question;

import java.awt.geom.Line2D;
import java.util.LinkedList;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement r = new RemoveElement();
        r.add(5);
        r.add(4);
        r.add(5);
        r.add(3);
        r.add(2);
        r.add(1);
        r.remove(5);
    }


    private Node head;
    private Node tail;

    int size;
    RemoveElement() {
        this.size = 0;
    }
    private static class Node {
        int val;
        Node next;

        public Node (int val) {

            this.val = val;
        }

        public Node (int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void add(int val) {
        Node node = new Node(val);
        if (tail == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        tail = node;
        size++;

    }


    public void remove(int val) {
        Node temp = head;
        do {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        while(temp != null);
        System.out.println("end");
    }
}
