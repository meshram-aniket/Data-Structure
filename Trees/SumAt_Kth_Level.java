package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class SumAt_Kth_Level {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        SumAt_Kth_Level s = new SumAt_Kth_Level();
        s.root = new Node(50);
        s.root.left = new Node(4);
        s.root.right = new Node(8);
        s.root.left.left = new Node(5);
        s.root.left.right = new Node(6);
        s.root.right.left = new Node(5);
        s.root.right.right = new Node(6);
        System.out.println(s.getSum(0));
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


    public void levelTraversal(Node node) {
        if (node == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(node);
        q.add(null);

        while(!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }
                else {
                    q.add(null);
                }
            }

            else {
                System.out.print(currNode.val + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }

                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public int getSum(int k) {
        return getSum(root, k, 0);
    }

    private int getSum(Node node, int k , int level) {
        if (node == null) {
            return 0;
        }

        if (level == k) {
            return node.val;
        }

        int leftSum = getSum(node.left, k, level + 1);
        int rightSum = getSum(node.right, k, level + 1);

        return leftSum + rightSum;
    }
}
