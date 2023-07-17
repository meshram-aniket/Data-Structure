package Trees;

import java.util.*;
public class Transversal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Transversal p = new Transversal();
        Node n = p.insert(arr);
//        p.preOrder(n);
//        p.inOrder(n);
//        p.postOrder(n);
        p.levelOrder(n);

    }

    private static class Node {
        int val;
        Node left;
        Node right;

        Node (int val) {
            this.val = val;
        }
    }

    private Node root;
    private int ind = -1;
    public Node insert (int[] arr) {
        ind++;
        if (arr[ind] == -1) {
            return null;
        }

        Node node = new Node(arr[ind]);
        node.left = insert(arr);
        node.right = insert(arr);
        return node;
    }


    // preorder transversal
    public void preOrder(Node node) {
        if (node == null) {
                return;
        }

        System.out.print(node.val + " -> ");
        preOrder(node.left);
        preOrder(node.right);
    }



    // in-Order transversal
    public void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.val + " -> ");
        inOrder(node.right);
    }



    // post-Order transversal
    public void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " -> ");
    }



    // level order transversal
    public void levelOrder(Node node) {
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
}
