import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        populate(sc);
        display();
    }


    public static class Node{
        int val;
        Node left;
        Node right;

        Node (int val) {
            this.val = val;
        }
    }

    private static Node root;
    public static void populate(Scanner sc) {
        System.out.println("enter the root of the tree: ");
        int val = sc.nextInt();
        root = new Node(val);
        populate(root, sc);
    }


    private static void populate(Node node, Scanner sc) {
        System.out.println("do you want to enter the left of " + node.val + "?");
        boolean left = sc.nextBoolean();

        if (left) {
            System.out.println("enter the the left of the "+ node.val);
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(node.left, sc);
        }


        System.out.println("do you want to enter the right of " + node.val + "?");
        boolean right = sc.nextBoolean();

        if (right) {
            System.out.println("enter the the right of the "+ node.val);
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(node.right, sc);
        }
    }


    public static void display() {
        display(root, 0);
    }


    public static void display(Node node, int level) {
        if (node == null) {
            return;
        }

        display(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t\t");
            }
            System.out.println("|------>" + node.val);
        }

        else {
            System.out.println(node.val);;
        }

        display(node.left, level + 1);
    }
}

