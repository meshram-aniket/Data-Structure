import Recursion.Practice;

import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {5, 1, 6, 3, 4, 2, 7};
        practice p = new practice();
        Node node = null;
        for (int i = 0; i < arr.length; i++) {
            node = p.insert(node, arr[i]);
        }
        p.inOrder(node);
        p.inRange(node, 2, 6);

    }

    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }


//    Node root;
    int ind = -1;
    public Node insert(Node node, int val) {
        ind++;
        if (node == null) {
            node = new Node(val);
            return node;
        }

        if (val < node.val) {
            node.left = insert(node.left, val);
        }
        else {
            node.right = insert(node.right, val);
        }

        return node;
    }


    public void inRange(Node node, int start, int end) {
        if (node == null) {
            return;
        }


        if (node.val >= start && node.val <= end) {
            inRange(node.left, start, end);
            System.out.println(node.val);
            inRange(node.right, start, end);
        }

        else {
            if (node.val >= start) {
                inRange(node.left, start, end);
//                System.out.println(node.val);
            } else {
                inRange(node.right, start, end);
//                System.out.println(node.val);
            }
        }
    }


    public void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

}