package Trees;

public class Diameter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -1, 3, -1, -1, 5, -1, -1, 3, -1, 6, -1, 8, -1, -1};
        Diameter s = new Diameter();
        Node n = s.populate(arr);
        System.out.println("the heigth is: " + s.height(n));
        System.out.println("diameter is: " + s.diameter(n));
    }

    public static class Node {
        int val;
        Diameter.Node left;
        Diameter.Node right;

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

        Diameter.Node node = new Diameter.Node(arr[ind]);
        node.left = populate(arr);
        node.right = populate(arr);
        return node;
    }


    public int height(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }



    public int diameter(Node node) {
        if (node == null) {
            return 0;
        }

        int leftDiameter = diameter(node.left);
        int rightDiameter = diameter(node.right);

        int dia = Math.max(height(node.left), height(node.right)) + 1;

        return dia + Math.min(leftDiameter, rightDiameter);
    }
}
