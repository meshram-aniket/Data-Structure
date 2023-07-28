import LinkList.Question.Palindrome;
import java.util.LinkedList;

public class practice {

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();


        practice p = new practice();
        p.insertfirst(3);
        p.insertfirst(4);
        p.insertfirst(5);
        p.insertfirst(6);
        p.insertfirst(7);
        p.display();

        p.reverse();
    }

    private Node head;
//    private Node tail;
    int size;
    practice() {
        this.size = 0;
    }

    public static class Node {
        int val;
        Node next;
        Node previous;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.previous = prev;
        }
    }


    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;

        if (head != null) {
            head.previous = node;
        }
        head = node;
        head.previous = null;
    }



    public Node getIndex(int val) {
        Node temp = head;
        for (int i = 0; i < val ; i++) {
            temp = temp.next;
        }
        return temp;
    }



    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }


    public void reverse() {
        Node temp = head;
        Node rev = null;
        while(temp != null) {
            rev = temp;
            temp = temp.next;
        }
//        System.out.println("end");

        while(rev != null) {
            System.out.print(rev.val + " -> ");
            rev = rev.previous;
        }
        System.out.println("head");
    }
}
