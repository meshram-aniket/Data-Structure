import Recursion.Practice;

import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 4, -1, 3, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        practice p = new practice();
        Node node = p.insert(arr);
        p.inOrder(node);
        System.out.println();
        System.out.println(p.diameter(node));
//        System.out.println(p.sum(node, 0, 1));

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
    public Node insert(int[] arr) {
        ind++;
        if (arr[ind] == -1) {
            return null;
        }

        Node root = new Node(arr[ind]);
        root.left = insert(arr);
        root.right = insert(arr);
        return root;
    }


    public int val(Node node) {
        return node.val;
    }


    public int height(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }


    public int diameter(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = diameter(node.left);
        int rightHeight = diameter(node.right);
        int max = Math.max(height(node.left), height(node.right)) + 1;

        return max + Math.min(leftHeight, rightHeight);
    }


    public void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);
    }


    public int sum(Node node, int s, int key) {

        if (node == null) {
            return 0;
        }

        if (key == s) {
            return node.val;
        }

        int left = sum(node.left, s + 1, key);
        int right = sum(node.right, s + 1, key);

        return left + right;
    }


//    public void display() {
//        display(root, 0);
//    }
//
//    private void display(Node root, int level) {
//        if (root == null) {
//            return;
//        }
//
//        display(root.right, level + 1);
//
//        if (level != 0) {
//            for (int i = 0; i < level - 1; i++) {
//                System.out.print("|\t\t");
//            }
//            System.out.println("|----->" + root.val);
//        }
//
//        else {
//            System.out.println(root.val);
//        }
//        display(root.left, level + 1);
//    }

}