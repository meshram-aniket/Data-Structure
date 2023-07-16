package LinkList.Question;

import LinkList.DLL;

import java.util.LinkedList;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome d = new Palindrome();
        d.insertFirst(34);
        d.insertFirst(43);
        d.insertFirst(64);
        d.insertFirst(387);
        d.display();
    }

    private Node head;

    private static class Node {
        int val;
        Node next;
        Node previous;

        public Node(int val) {
            this.val= val;
        }

        public Node(int val, Node next, Node previous) {
            this.val= val;
            this.next = next;
            this.previous = previous;
        }

    }

    public void insertFirst(int val)  {
        Node node = new Node(val);
        node.next = head;
        node.previous = null;
        if (head != null) {
            head.previous = node;
        }
        head = node;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            last = node;
            System.out.print(node.val+" -> ");
            node = node.next;
        }
        System.out.println("end");


        while (last != null) {
            System.out.print(last.val + " - > ");
            last = last.previous;
        }
        System.out.println("start");

    }


}
