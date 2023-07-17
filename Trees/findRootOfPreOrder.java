package Trees;

public class findRootOfPreOrder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        findRootOfPreOrder node = new findRootOfPreOrder();
        Node root = node.preOrderTree(arr);
        System.out.println(root.val);
        node.display();
        preorder(root);
        inorder(root);
        postorder(root);

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
        static int inc = -1;
        public Node preOrderTree ( int[] arr){
            inc++;
            if (arr[inc] == -1) {
                return null;
            }

            Node node = new Node(arr[inc]);
            node.left = preOrderTree(arr);
            node.right = preOrderTree(arr);
            return node;
        }


        public static void preorder (Node root){
            if (root == null) {
                return;
            }
            System.out.print(root.val + " -> ");
            preorder(root.left);
            preorder(root.right);
        }


        public static void inorder (Node root){
            if (root == null) {
                return;
            }

            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);

        }



        public static void postorder (Node root){
            if (root == null) {
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val + " ");
        }

        public void display () {
            display(root, 0);
        }

        private void display (Node node,int level){
            if (node == null) {
                return;
            }

            display(node.right, level + 1);

            if (level != 0) {
                for (int i = 0; i < level - 1; i++) {
                    System.out.print("|\t\t");
                }
                System.out.println("|------>" + node.val);
            } else {
                System.out.println(node.val);
            }

            display(node.left, level + 1);
        }


}
