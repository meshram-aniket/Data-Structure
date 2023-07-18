package Trees;

public class SumOfNode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        SumOfNode s = new SumOfNode();
        Node n = s.populate(arr);
        System.out.println(s.count(n));
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


    public int count(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = count(root.left);
        int rightSum = count(root.right);

        return leftSum + rightSum + root.val;
    }

}
