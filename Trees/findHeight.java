package Trees;

public class findHeight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        findHeight h = new findHeight();
        Node n = h.populate(arr);
        System.out.println(h.countHeight(n));

    }


    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    int ind = -1;
    public Node populate(int[] arr) {
        ind++;
        if (arr[ind] == -1) {
            return null;
        }

        Node node = new Node(arr[ind]);
        node.left = populate(arr);
        node.right = populate(arr);
        return node;
    }


    public int countHeight (Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = countHeight(node.left);
        int rightHeight = countHeight(node.right);
        int height = Math.max(leftHeight, rightHeight) + 1;

        return height;
    }
}
