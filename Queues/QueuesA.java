package Queues;

public class QueuesA {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }


    static class Queue {
        static int[] array;
        static int tail = -1;
        static int size;
        static int head = 0;
        Queue(int num) {
            array = new int[num];
            this.size = num;
        }


        public static void add(int data) {
           if (tail == size - 1) {
               System.out.println("array is full");
               return;
           }
           tail++;
           array[tail] = data;

        }


        public static int remove() {
            if (isEmpty()) {
                return -1;
            }

            int front = array[0];
            for (int i = 0; i < tail; i++) {
                array[i] = array[i + 1];
            }
            tail--;
            return front;
        }


        public static int peek() {
            if (isEmpty()) {
                return -1;
            }

            return array[0];
        }

        public static boolean isEmpty() {
            return tail == -1;
        }
    }

}
