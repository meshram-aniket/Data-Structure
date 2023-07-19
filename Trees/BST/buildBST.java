package Trees.BST;

public class buildBST {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = BT(root, arr[i]);
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



    public static Node BT(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.val) {
            root.left = BT(root.left, val);
        }
        else {
            root.right = BT(root.right, val);
        }
        return root;
    }


    public static void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " -> ");
        inOrder(node.right);
    }
}
