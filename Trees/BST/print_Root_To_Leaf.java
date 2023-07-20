package Trees.BST;

import java.util.ArrayList;

public class print_Root_To_Leaf {
    public static void main(String[] args) {
        int[] arr = {8, 5, 3, 6, 10, 11, 14};
        ArrayList<Integer> list = new ArrayList<>();
        print_Root_To_Leaf p = new print_Root_To_Leaf();
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = p.insert(root, arr[i]);
        }

        p.inOrder(root);
        System.out.println();

        p.printRoot2Leaf(root, list);
    }

    public class Node {
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

        if (val <= node.val) {
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



    public void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println();
    }

    public void printRoot2Leaf(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return;
        }

        list.add(node.val);
        if (node.left == null && node.right == null) {
            printList(list);
        }
        else {
            printRoot2Leaf(node.left, list);
            printRoot2Leaf(node.right, list);
        }
        list.remove(list.size() - 1);
    }
}
