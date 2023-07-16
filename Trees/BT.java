package Trees;

import java.util.*;
public class BT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BT b = new BT();
        b.populate(scanner);
        b.display();
    }

    private static class Node {
        int val;
        Node left;
        Node right;

        public Node (int val) {
            this.val = val;
        }
    }

    Node root;
    public void populate (Scanner scanner) {
        System.out.println("enter the value of root");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner, root);
    }

    public void populate (Scanner scanner, Node node) {
        System.out.println("do you want to enter the left of " + node.val);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("enter the left of " + node.val);
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner, node.left);
        }

        System.out.println("do you want to enter right of " + node.val);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("enter the right of " + node.val);
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display (root, 0);
    }

    private void display (Node node, int level) {
        if (node == null) {
            return;
        }

        display (node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.val);
        }

        else {
            System.out.println(node.val);
        }

        display(node.left, level + 1);
    }

}
