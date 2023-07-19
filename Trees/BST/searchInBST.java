package Trees.BST;

public class searchInBST {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 2, 7};
        searchInBST search = new searchInBST();
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
           root = insert(root, arr[i]);
        }

        search.inOrder(root);
        System.out.println();

        if (isPresent(root, 5)) {
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }


    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }


    public static Node insert(Node node, int val) {
        if (node == null) {
            node = new Node(val);
            return node;
        }

        if (node.val > val) {
            node.left = insert(node.left, val);
        }

        else {
            node.right = insert(node.right, val);
        }
        return node;
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }



    public static boolean isPresent(Node node, int key) {
        if (node == null) {
            return false;
        }

        if (node.val == key) {
            return true;
        }

        else if (key < node.val) {
            return isPresent(node.left, key);
        }

        else {
            return isPresent(node.right, key);

        }
    }
}
