package Queues;

public class CustomQueue {
//    static class CustomQueue {
        private int[] array;

        int end = -1;

        public CustomQueue(int size) {

            array = new int[size];
        }

        public boolean isFull() {
            return end == array.length;
        }

        public boolean isEmpty() {
            return end == -1;
        }

        public void insertFirst(int item)  {
            if (isFull()) {
                System.out.println("queue is full");
            }
            end++;
            array[end] = item;
        }

        public int remove() throws Exception {
            int val = array[0];
            if (isEmpty()) {
                throw new Exception("Queue is empty");
            }

            for (int i = 0; i < end - 1; i++) {
                array[i] = array[i + 1];
            }
            end--;
            return val;
        }


        public int front() throws Exception {
            if (isEmpty()) {
                throw new Exception("Queue is Empty");
            }

            return array[0];
        }


        public void display() {
            for (int i = 0; i <= end; i++) {
                System.out.print(array[i] + " <- ");
            }
            System.out.println("end");
        }
//    }

    public static void main(String[] args) throws Exception {
        CustomQueue q = new CustomQueue(5);
        q.insertFirst(4);
        q.insertFirst(5);
        q.insertFirst(6);
        q.insertFirst(7);
        q.insertFirst(8);
        q.display();

        System.out.println(q.remove());
        q.display();

        System.out.println(q.front());

    }


}
