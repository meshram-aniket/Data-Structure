package Queues;

public class CircularQueue {

    protected int[] array;
    protected int front = 0;
    protected int end = 0;
    private int size = 0;
    public CircularQueue(int num) {
        array = new int[num];
    }

    public boolean isFull() {
        return size == array.length;
    }
    public boolean isEmpty() {
        return size == 0;
    }


    public void insert(int item) {
        if (isFull()) {
            System.out.println("Full");
            return;
        }

        array[end++] = item;
        end = end % array.length;
        size++;
    }


    public int remove() throws Exception {
        int ret =array[front];
        if(isEmpty()) {
            throw new Exception("Empty");
        }

        front++;
        front = front % array.length;
        size--;
        return ret;
    }


    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty");
        }

        return array[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("empty");
            return;
        }
        int i = front;
        do {
            System.out.print(array[i]+" -> ");
            i++;
            i %= array.length;
        } while(i != end);
        System.out.println("end");
    }

    public static void main(String[] args) throws Exception {
        CircularQueue l = new CircularQueue(5);
        l.insert(5);
        l.insert(6);
        l.insert(8);
        l.insert(7);
        l.insert(10);
        l.display();

        System.out.println(l.remove());
        l.display();

        System.out.println(l.front());
    }

}
