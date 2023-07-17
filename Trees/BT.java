package Trees;

import jdk.jshell.execution.JdiDefaultExecutionControl;

import java.util.*;
public class BT {
    public static void main(String[] args) {
        BT tree = new BT();
        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
        tree.populate(nums);
//        tree.display();
        tree.display1();
        
    }

    public static class Node {
        private int val;
        private int height;
        private Node left;
        private Node right;

        public Node (int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }
    }

    private Node root;

    public BT() {

    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }


    public boolean isEmpty() {
        return root == null;
    }

    
    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }


    public void populateSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        this.insert((nums[mid]));
        populateSorted(nums, start, end);
        populateSorted(nums, mid + 1, end);
    }


    public void insert (int val) {
        root = insert(val, root);
    }

    private Node insert (int val, Node node) {
        if (node == null) {
            node = new Node(val);
            return node;
        }
        if (val < node.val) {
            node.left = insert(val, node.left);
        }
        if (val > node.val) {
            node.right = insert(val, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right));
        return node;
    }


    public boolean balanced () {
        return balanced(root);
    }

    private boolean balanced (Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(this.root, "root node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.getVal());

        display(node.left , "left child of " + node.val + " :");
        display(node.right, "right child of " + node.val + " :");
    }

    public void display1() {
        display1(root, 0);
    }

    private void display1(Node node, int level) {
        if (node == null) {
            return;
        }

        display1(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.val);
        }

        else {
            System.out.println(node.val);
        }

        display1(node.left, level + 1);
    }
}
