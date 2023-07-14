package Queues;

import LinkList.LL;

public class QueuesLL {
    public static void main(String[] args) {
        QueuesLL l = new QueuesLL();
        l.insertLast(5);
        l.insertLast(6);
        l.insertLast(8);
        l.display();
    }


     private Node head;
     private Node tail;

     private int size;
     public QueuesLL() {
         this.size = 0;
     }

     private class Node {
         int value;
         Node next;

         Node(int data) {
             this.value = data;
         }
     }

    public void insertLast (int val) {
        if (tail == null) {
            tail = head;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }


    public int remove() {

        if (head == null) {
            return -1;
        }
        int ret = head.value;
        head = head.next;
        size--;
        return ret;
    }


    public int peek() {
        if (head == null) {
            return -1;
        }

        return head.value;
    }


    public void display() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

}
