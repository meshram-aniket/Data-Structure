package LinkList.Question;

public class Merge_two_Sorted_Array {

    public static void main(String[] args) {
        Merge_two_Sorted_Array first = new Merge_two_Sorted_Array();
        Merge_two_Sorted_Array second = new Merge_two_Sorted_Array();
        first.add(1);
        first.add(3);
        first.add(5);

        second.add(1);
        second.add(2);
        second.add(9);
        second.add(14);

        Merge_two_Sorted_Array third = Merge(first, second);
        third.display();

    }


    Node head;
    public static class Node {
        int val;
        Node next;

        Node (int val) {
            this.val = val;
        }

        Node (int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


    public void add(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
    }


    public static Merge_two_Sorted_Array Merge(Merge_two_Sorted_Array first, Merge_two_Sorted_Array second) {
        Node f = first.head;
        Node s = second.head;
        Merge_two_Sorted_Array ans = new Merge_two_Sorted_Array();
        while(f != null && s != null) {
            if (f.val < s.val) {
                ans.add(f.val);
                f = f.next;
            } else {
                ans.add(s.val);
                s = s.next;
            }
        }

        while(f != null) {
            ans.add(f.val);
            f = f.next;
        }

        while(s != null) {
            ans.add(s.val);
            s = s.next;
        }
        return ans;
    }



    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

}
