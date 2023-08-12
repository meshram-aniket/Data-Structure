package LinkList;

public class CLL {
    public static void main(String[] args) {

        CLL list = new CLL();
        list.insertFirst(35);
        list.display();
        list.insertFirst(12);
        list.display();
        list.insertFirst(10);
        list.display();

        list.insertLast(30);
        list.display();
        list.insertLast(100);
        list.display();
        list.insert(1000, 3);
        list.display();
//
        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();


        list.delete(30);
        list.display();
    }

    private Node head;
    private Node tail;
    private int size;

    public CLL() {
        this.size = 0;
    }

    private class Node {
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


    public void insertFirst(int val ) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        head = node;
        size++;
    }


    public void insertLast (int val) {
        Node node = new Node(val);
        if (head == null) {
            insertFirst(val);
            return;
        }

        node.next = head;
        tail.next = node;
        tail = node;
        size++;
    }


    public void insert (int val, int index) {

        Node ind = getInd(index - 1);
        if (ind == null) {
            insertFirst(val);
            return;
        }

        if (ind == tail) {
            insertLast(val);
            return;
        }

        Node node = new Node(val);
        node.next = ind.next;
        ind.next = node;
        size++;

    }


    public int deleteFirst() {


        int val = head.val;
        head = head.next;
        if (head.next == head) {
            tail = head;
        }
        tail.next = tail.next.next;
        size--;
        return val;
    }


    public int deleteLast () {
        int val = tail.val;
        if (head == tail) {
            deleteFirst();
            return val;
        }

        Node secondLast = getInd(size - 1);
//      secondLast.next = head;
        tail = secondLast;
        tail.next = head;
        size--;
        return val;

    }


    public void delete (int val) {
        Node temp = head;

        if (val == head.val) {
            deleteFirst();
            return;
        }

        if (val == tail.val) {
            deleteLast();
            return;
        }

        while(temp.next.val != val) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        size--;

    }


    public Node getInd(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    public void display () {
        Node temp = head;
        if (temp.next == null) {
            System.out.println(temp.val +" -> HEAD");
            return;
        }
        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while(temp != head);

        System.out.println("HEAD");
    }
}
