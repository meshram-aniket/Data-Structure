package Trees.BST;

public class printInRange {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 2, 7};
        printInRange p = new printInRange();
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = p.insert(root, arr[i]);
        }

        p.inOrder(root);
        System.out.println();

        p.print(root, 4, 10);

    }

    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }


    public Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }



    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " -> ");
        inOrder(node.right);
    }



    public void print(Node node, int X, int Y) {
        if (node == null) {
            return;
        }


        if (node.val >= X && node.val <= Y) {
            print(node.left, X, Y);
            System.out.print(node.val + " ");
            print(node.right, X, Y);
        }

        else {
            if (node.val >= Y) {
                print(node.left, X, Y);
            }

            else {
                print(node.right, X, Y);
            }
        }
    }



}
