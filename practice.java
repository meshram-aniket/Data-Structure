import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.LinkedList;

public class practice {

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();


        practice p = new practice();
        p.insertfirst(5);
//        p.insertfirst(6);
//        p.insertfirst(7);
        p.display();
//        p.insertLast(4);
//        p.insertLast(5);
//        p.insertfirst(10);
//        p.display();
//        p.add(2, 100);
//        p.display();
//        System.out.println(p.get(2));
//        System.out.println(p.size());
////        p.insert(4, 1);
////        p.display();
//        System.out.println(p.removeFirst());
//        p.display();
//        System.out.println(p.removeFirst());
//        p.display();
//        System.out.println(p.removeLast());
//        p.display();
////        p.deletelast();
//        p.deletelast();
//        p.deletelast();
//        p.display();




    }

    private Node head;
    private Node tail;
    int size;
    practice() {
        this.size = 0;
    }

    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
        }
    }


    public void insertfirst(int val) {
        Node node = new Node(val);

        if (tail == null) {
            head = tail = node;
            return;
        }
        node.next = head;
        head = node;
        tail.next = node;
        size++;
    }



    public void insertLast(int val) {

        Node node = new Node(val);
        if (head ==  null) {
            insertfirst(val);
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }



    public void add (int index, int val) {
        Node node = new Node(val);
        if (index == 0) {
            insertfirst(val);
            return;
        }
        if (index == tail.val) {
            insertLast(val);
            return;
        }
        Node temp = getIndex(index - 1);
        temp.next = node;
        node.next = temp.next.next;
    }



    public int get(int index) {
        Node Index = getIndex(index);
        return Index.val;
    }


    public int size() {
        return size;
    }








//    public void insert(int val, int pos) {
//        Node node = new Node(val);
//        if (pos == 0) {
//            insertfirst(val);
//            return;
//        }
//
//        if (pos == size - 1) {
//            insertLast(val);
//            return;
//        }
//        Node secondLast = getIndex(pos);
//        node.next = secondLast.next;
//        secondLast.next = node;
//
//        size++;
//
//    }


//    public int removeFirst() {
//
//    }
//
//
//
//    public int removeLast() {
//
//
//
//    }

//    public int remove

//    public int removeFirst() {
//
//    }
//
//
//    public int deletelast() {
//
//    }


    public Node getIndex(int val) {
        Node temp = head;
        for (int i = 0; i < val ; i++) {
            temp = temp.next;
        }
        return temp;
    }




    public void display() {
       Node temp = head;
        if (temp.next == null) {
            System.out.println(temp.val +" -> HEAD");
            return;
        }
       do {
           System.out.print(temp.val + " -> ");
           temp = temp.next;
       }
       while (temp != head);
        System.out.println("end");
    }
}
