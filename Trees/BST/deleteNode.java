package Trees.BST;

import LinkList.Question.Palindrome;

public class deleteNode {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 2, 7};
        deleteNode d = new deleteNode();
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = d.insert(root, arr[i]);
        }

        d.inOrder(root);
        System.out.println();

        d.delete(root, 3);
        d.inOrder(root);
    }




    Node root;
    public class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
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



    public Node delete(Node node, int val) {
        if (val < node.val) {
            node.left = delete(node.left, val);
        }

        else if(val > node.val) {
            node.right = delete(node.right, val);
        }

        else{
            // root == val
            // case 1
            if (node.left == null && node.right == null) {
                return null;
            }


            // case 2
            if (node.left == null) {
                return node.right;
            }
            else if (node.right == null){
                return node.left;
            }


            // case 3
            Node IS = inorderSuccessor(node.right);
            node.val = IS.val;
            node.right = delete(node.right, IS.val);

        }
        return node;
    }

    public Node inorderSuccessor(Node node) {
        while(node.left != null) {
            node = node.left;
        }
        return node;
    }

}
