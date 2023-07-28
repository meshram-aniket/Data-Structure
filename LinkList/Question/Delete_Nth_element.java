package LinkList.Question;

import LinkList.LL;

import java.util.LinkedList;

public class Delete_Nth_element {
    public static void main(String[] args) {
        Delete_Nth_element l = new Delete_Nth_element();
        l.insertLast(4);
        l.insertLast(5);
        l.insertLast(7);
        l.display();
        l.Delete(2);
        l.display();
    }
    private Node head;
    private Node tail;
    private int size;

    public Delete_Nth_element() {
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
    public void insertLast (int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        }
        Node last = getIndex(size - 1);
        last.next = node;
        node.next = null;
        size++;
    }


    public int size() {
        return size + 1;
    }


    public void Delete(int index) {
        Node temp = head;
        if (index == 0) {
            head = head.next;
            return;
        }

        if (index == size) {
            Node secondLast = getIndex(size - 2);
            secondLast.next = null;
            return;
        }
        Node second = getIndex(index - 1);
        second.next = second.next.next;
        size--;
    }

    public Node getIndex(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display() {
        Node  temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

}
