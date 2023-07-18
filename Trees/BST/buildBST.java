package Trees.BST;

public class buildBST {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 2, 7};
        Node n = null;
        for (int i = 0; i < arr.length; i++) {

            n = BT(n, arr[i]);
        }

        inOrder(root);
        System.out.println();

    }

    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }


    static Node root;
    public static Node BT(Node node, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.val) {
            root.left = BT(node.left, val);
        }
        else {
            root.right = BT(node.right, val);
        }
        return root;
    }


    public static void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.println(node.val);
        inOrder(node.right);
    }
}
