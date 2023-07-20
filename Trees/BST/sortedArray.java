package Trees.BST;

public class sortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        sortedArray s = new sortedArray();
        Node node = s.insert(arr);
        s.inOrder(node);
    }


    public static class Node {
        int val;
        Node left;
        Node right;

        Node (int val) {
            this.val = val;
        }
    }


    int ind = -1;
    public Node insert(int[] arr) {
        ind++;
        if (arr[ind] == -1) {
            return null;
        }

        Node node = new Node(arr[ind]);
        node.left = insert(arr);
        node.right = insert(arr);
        return node;
    }


    public void inOrder(Node node) {
        if (node == null){
            return;
        }

        System.out.println(node.val + " ");
        inOrder(node.left);
        inOrder(node.right);
    }
    public void display() {
//        display( 0);
    }


    private void display(Node node, int level) {
        if (node == null) {
            return;
        }

        display(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.val);
        }

        else {
            System.out.println(node.val);
        }

        display(node.left, level + 1);

    }
}
