import LinkList.Question.Palindrome;
import Trees.BST.deleteNode;

import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {5, 1, 6, 3, 4, 2, 7};
        practice p = new practice();
        Node node = null;
        for (int i = 0; i < arr.length; i++) {
            node = p.insert(node, arr[i]);
        }

//        p.inOrder(node);
//        System.out.println();
//        p.delete(node, 3);
//        p.inOrder(node);
//        System.out.println();


        p.sortedArray(node, arr, 0, arr.length - 1);
        p.inOrder(node);



    }


    Node root;
    public static class Node {
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


    public void printInRange (Node node, int X, int Y) {
        if (node == null) {
            return;
        }

        if (node.val >= X && node.val <= Y) {
            System.out.print(node.val + " ");
        }

        if (node.val >= X) {
//            System.out.print(node.val);
            printInRange(node.left, X, Y);
        }

        if (node.val <= Y){
            printInRange(node.right, X, Y);
        }
    }

    public void print(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }
//
//


    public Node delete (Node node, int key) {

        if (key < node.val) {
            node.left = delete(node.left, key);
        }

        else if (key > node.val) {
            node.right = delete(node.right, key);
        }

        else {
            if (node.right == null && node.left == null) {
                return null;
            }

            if (node.left == null) {
                return node.right;
            }

            else if (node.right == null) {
                return node.left;
            }

            Node id = inOrderSuccessor(node.right);
            node.val = id.val;
            node.right = delete(node.right, id.val);
        }
        return node;
    }

    public Node inOrderSuccessor(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }


    public void display() {
        display(root, "root val");
    }

    private void display(Node node, String detail) {
        if (node == null) {
            return;
        }

        System.out.println(detail + node);
        display(node.left, "left of " + node.val+ ":" + node.left);
        display(node.right, "right of " + node.val+ ":" + node.right);
    }



//    public Node delete(Node node, int key) {
//        if (node == null) {
//            return null;
//        }
//
//        if (key < node.val) {
//            node.left = delete(node.left, key);
//        }
//
//        if (key > node.val) {
//            node.right = delete(node.right, key);
//        }
//
//        else {
//
//            // case 1
//            if (node.left == null && node.right == null) {
//                return null;
//            }
//
//
//            // case 2
//            if (node.left == null) {
//                return node.right;
//            }
//            else if (node.right == null) {
//                return node.left;
//            }
//
//            // case 3
//            else {
//                Node id = inOrderSuccesor(node.right);
//                node.val = id.val;
//                id.right = delete(node.right, id.val);
//            }
//        }
//
//        return node;
//    }


//
    public void sortedArray (Node node, int[] arr, int start, int end) {


        if (node == null) {
            return;
        }
        if(start <= end) {
            return;
        }

        int mid = (start + end) / 2;
        insert(node, arr[mid]);
        sortedArray(node.left, arr, 0, mid - 1);
        sortedArray(node.right, arr, mid + 1, end);
    }

//    public void populateSorted(int[] nums) {
//        populateSorted(nums, 0, nums.length - 1);
//    }
//
//
//    private void populateSorted(int[] nums, int start, int end) {
//        if (start >= end) {
//            return;
//        }
//
//        int mid = (start + end) / 2;
//
//        this.insert((nums[mid]));
//        populateSorted(nums, start, mid);
//        populateSorted(nums, mid + 1, end);
//
//    }




}