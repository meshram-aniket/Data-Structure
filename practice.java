import LinkList.Question.Palindrome;
import java.util.LinkedList;

public class practice {
    public static void main(String[] args) {
        practice list1 = new practice();
        list1.Add(2);
        list1.Add(5);
        list1.Add(7);
        list1.Add(10);
        list1.display();


        practice list2 = new practice();
        list2.Add(1);
        list2.Add(3);
        list2.Add(6);
        list2.Add(11);
        list2.display();



        practice C = practice.Merge(list1, list2);
        C.display();

    }

    private int size;

    private  Node head;
    private Node tail;
    practice() {
        this.size = 0;
    }

    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }

        Node (int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void Add(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        tail = node;
        size++;

    }


    public static practice Merge(practice A, practice B) {
        Node first = A.head;
        Node second = B.head;

        practice third = new practice();
        while (first != null && second != null) {
            if (first.val < second.val) {
                third.Add(first.val);
                first = first.next;
            }
            else {
                third.Add(second.val);
                second = second.next;
            }
        }


        while (first != null) {
            third.Add(first.val);
            first = first.next;
        }

        while (second != null) {
            third.Add(second.val);
            second = second.next;
        }

        return third;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }
}

