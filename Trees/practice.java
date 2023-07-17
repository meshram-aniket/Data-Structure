package Trees;

import java.util.*;
public class practice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        practice p = new practice();
        Node node = p.populate(arr);
        p.levelOrder(node);

    }

    private static class Node {
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



    public void levelOrder(Node currNode) {
        if (currNode == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(currNode);
        q.add(null);


        while(!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }
                else {
                    q.add(null);
                }
            }

            else {
                System.out.print(curr.val + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }
}
