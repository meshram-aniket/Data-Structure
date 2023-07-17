package Trees;

public class CountNodes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        CountNodes c = new CountNodes();
        Node n = c.preOrder(arr);
        System.out.println(c.count(n));
    }

    private static class Node {
        int val;
        Node right;
        Node left;

        Node(int val) {
            this.val = val;
        }
    }


    int ind = -1;
    public Node preOrder(int[] arr) {
        ind++;
        if (arr[ind] == -1) {
            return null;
        }

        Node node = new Node(arr[ind]);
        node.left = preOrder(arr);
        node.right = preOrder(arr);
        return node;
    }


    public int count(Node node) {
        if (node == null) {
            return 0;
        }
        int left = count(node.left);
        int right = count(node.right);

        return left + right + 1;
    }
}
