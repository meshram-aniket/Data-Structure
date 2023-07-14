package Queues;

public class LLQueue {
    public static void main(String[] args) {
        LLQueue q = new LLQueue();
        q.insert(5);
        q.insert(6);
        q.insert(7);
        q.insert(8);
        q.display();

        System.out.println(q.remove());
        q.display();

        System.out.println(q.front());
    }


    private Node head;
    private Node tail;
    private int size;

    public LLQueue() {
        this.size = 0;
    }

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }


//    enqueue
    public void insert(int value) {
        Node node = new Node(value);
        if (tail == null) {
            tail = head = node;
            return;
        }

        tail.next = node;
        tail = node;
        size++;
    }


//    dequeue
    public int remove() {
        int remove = head.value;
        if (tail == null) {
            return -1;
        }
        head = head.next;
        size--;
        return remove;
    }


//    peek
    public int front() {
        int front = head.value;
        if (tail == null) {

        }
        return front;
    }


    public void display() {
        Node temp = head;
        for (int i = 0; i <= size; i++) {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

}
