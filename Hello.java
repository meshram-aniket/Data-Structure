import java.util.*;

public class Hello {
    public static void main(String[] args) {
//
        Que q = new Que(6);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        q.add(11);
        q.add(12);
        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.peek());
    }

   private static ArrayList<Integer> a;

    public static class Que {
        Que(int size) {
            a = new ArrayList<>();
        }

        public void add(int val) {
            a.add(val);
        }


        public int remove() {
           if (a.isEmpty()) {
               return -1;
           }
           int val = a.get(0);
           a.remove(0);
           return val;
        }


        public int peek() {
            if (a.isEmpty()) {
                return -1;
            }

            return a.get(0);
        }


        public void display() {
            for (int i = 0; i < a.size(); i++) {
                System.out.print(a.get(i) + " -> ");
            }

            System.out.println("end");
        }
    }
}
