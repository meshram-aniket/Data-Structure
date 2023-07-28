package LinkList;

public class DLL {

    Node head;

    public void insertFirst(int val)  {
        Node node = new Node(val);
        node.next = head;
        node.previous = null;
        if (head != null) {
           head.previous = node;
        }
        head = node;
    }
//    h                 t
//    1 <=> 2 <=> 3 <=> 5 <=>


    public void insertLast (int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.previous = null;
            head = node;
            return;
        }
        while (last.next != null)
        {
            last = last.next;
        }

        last.next = node;
        node.previous = last;
    }


    public Node find(int index) {
        Node node = head;
        while(node != null) {
            if (node.val == index) {
                return node;
            }

            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.previous = p;
        if (node.next != null) {
            node.next.previous = node;
        }
    }



    public int removeFirst() {
        int val = head.val;
        head = head.next;
        if (head == null) {
            return 0;
        }
        head.previous = null;
        return val;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("end");

        System.out.println("print to reverse ");
        while (last != null) {
            System.out.print(last.val + " - > ");
            last = last.previous;
        }
        System.out.println("start");

    }


    private class Node {
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

    public static void main(String[] args) {
        DLL d = new DLL();
        d.insertFirst(34);
//        d.insertFirst(43);
//        d.insertFirst(64);
//        d.insertFirst(387);
//
//        d.insertLast(43);
//
//        d.insert(43, 65);

        d.display();
    }
}
