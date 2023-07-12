package LinkList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }


    private class Node {
        private int value;
        private Node next;

        public Node (int value) {
            this.value = value;
        }

        public Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    // to insert in values in LL
    public void insertFirst (int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }


    // insert value at last position
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node  = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }


    public void insert (int val, int index) {
        if (index  == 0) {
            insertLast(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;


    }


    // to display LL
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }


    // to delete firstvalue
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = head;
        }
        size--;
        return val;
    }

   // to delete lastelement
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;

    }


    // to delete index
    public int delete (int index) {
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size -1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;


    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }





    // insert using recursion

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val,int index, Node  node) {
        if(index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }


    //   remove duplicate
    public void duplicate() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }



    // merge two linked list
    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();
        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            }
            else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }


    public static void main(String[] args) {
        LL list = new LL();
//        list.insertFirst(3);;
//        list.insertFirst(5);
//        list.insertFirst(17);
//
//        list.insertLast(99);
//
//        list.insert(10,4);
//
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//
//        System.out.println(list.deleteLast());
//        list.display();
//
//        System.out.println(list.delete(1));
//        list.display();

//
//        list.insertRec(4, 2);
//        list.display();
//        System.out.println();


//        list.insertFirst(1);
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(3);
//        list.insertFirst(3);
//        list.display();
//        list.duplicate();




        LL list1 = new LL();
        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);

        LL list2 = new LL();
        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(9);
        list2.insertLast(14);


        LL ans = LL.merge(list1, list2);
        ans.display();


        list.display();
    }
}
