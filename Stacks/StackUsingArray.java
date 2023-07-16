package Stacks;

public class StackUsingArray {

    public static void main(String[] args) {
        Stacks s = new Stacks(5);
        s.push(8);
        s.push(9);
        s.push(10);
        s.push(11);
        s.push(12);
        s.display();
        s.push(13);
        System.out.println(s.pop());
        s.display();
        System.out.println(s.pop());
        s.display();
        System.out.println(s.peek());
//        System.out.println(s.peek());
    }
    private static int[] array;
    private static int position = 0;
    private static int last;
    private static class Stacks {
        public Stacks(int size) {
            array = new int[size];
            last = array.length;
        }


        // insert
        public void push(int val) {
            if (isFull()) {
                System.out.println("stack is full");
                return;
            }
            array[position] = val;
            position++;
        }


        // remove
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int val = array[last - 1];
            last--;
            return val;
        }


        // peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return array[last - 1];
        }


        public boolean isFull() {
           return position == last;
        }


        public boolean isEmpty() {
            return position == -1;
        }


        public void display() {
            for (int i = last - 1; i >= 0; i--) {
                System.out.print(array[i] + " -> ");
            }
            System.out.println("end");
        }
    }
}
