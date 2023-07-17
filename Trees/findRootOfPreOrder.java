package Trees;

public class findRootOfPreOrder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        findRootOfPreOrder node = new findRootOfPreOrder();
        Node root = node.preOrderTree(arr);
        System.out.println(root.val);
    }

    public static class Node {
        int val;
        Node left;
        Node right;


        Node(int val) {
            this.val = val;
        }
    }

    Node root;
    static int inc = -1;

    public Node preOrderTree(int[] arr) {
        inc++;
        if (arr[inc] == -1) {
            return null;
        }

        Node node = new Node(arr[inc]);
        node.left = preOrderTree(arr);
        node.right = preOrderTree(arr);
        return node;
    }
}

