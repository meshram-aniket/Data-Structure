package Stacks;

public class StacksLL {

    static Node head;
    static class Node {
        int value;
        Node next;

        Node (int value) {
            this.value = value;
            this.next = null;
        }
    }


    static class Stack {


//        to insert data
        public void push(int value) {
            Node node = new Node(value);

            if (isEmpty()){
                head = node;
                return;
            }
            node.next = head;
            head = node;
        }



        public int pop() {
            if (isEmpty()) {
                return -1;
            }

            Node temp = head;
            head = head.next;
            return temp.value;
        }



        public int peek() {
            if (head == null) {
                return -1;
            }

            Node top = head;
            return top.value;
        }



        public boolean isEmpty() {
            return head == null;
        }
    }


    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }

    }
}
