package LinkList.Question;

import java.util.LinkedList;

public class RemoveDuplicate {
    public static void main(String[] args) {
        RemoveDuplicate l = new RemoveDuplicate();
        l.add(4);
        l.add(5);
        l.add(5);
        l.add(5);
        l.add(6);
        l.add(7);
//        l.add(7);
        l.remove();
//        l.display();
    }


    Node head;
    public static class Node {
        int val;
        Node next;

        Node (int val) {
            this.val = val;
        }

        Node (int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


    public void add(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
    }


    public void remove() {
        Node temp = head;
        while(temp.next != null) {
            System.out.print(temp.val + " -> ");
            if (temp.val == temp.next.val) {
                temp = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
        System.out.println("end");
    }
//   4 -> 5 -> 5 -> 5 -> 6 -> 7 -> end
//   t    t         t
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }
}
