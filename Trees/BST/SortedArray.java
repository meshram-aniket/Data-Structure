package Trees.BST;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2, 4, 7, 6};
        SortedArray s = new SortedArray();
        Node node = null;
        for (int i = 0; i < arr.length; i++) {
            node = s.insert(node, arr[i]);
        }

        s.inOrder(node);
        System.out.println();
        s.sortedArray(node, arr, 0, arr.length - 1);
        s.display(node, "root is: ");


    }


    public static class Node {
        int val;
        Node left;
        Node right;

        Node (int val) {
            this.val = val;
        }
    }


    public Node insert(Node node, int val) {
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


    public void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }


    public void sortedArray(Node node, int[] arr, int start, int end) {
        if (start <= end) {
            return;
        }

        int mid = (start + end) / 2;
        insert(node, arr[mid]);
        sortedArray(node.left, arr, 0, mid - 1);
        sortedArray(node.right, arr, mid + 1, end);
    }



    public void display(Node node, String details) {
        if (node == null) {
            return;
        }

        System.out.println(details + node.val);
        display(node.left, "left of " + node.val + " : ");
        display(node.right, "right of " + node.val + " : ");
    }


}
