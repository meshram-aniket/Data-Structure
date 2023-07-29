package Trie.Questions;

public class CountUniqueString {
    static class Node {
        Node[] children;
        boolean eow;


        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }


    public static Node root = new Node();

    // insertion
    public static void insert(String word) { //O(n)
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int ind = word.charAt(i) - 'a';

            if (curr.children[ind] == null) {
                curr.children[ind] = new Node();
            }

            if (i == word.length() - 1) {
                curr.children[ind].eow = true;
            }
            curr = curr.children[ind];
        }
    }



//    public static boolean search(String key) { //O(n)
//        Node curr = root;
//        for (int i = 0; i < key.length(); i++) {
//            int ind = key.charAt(i) - 'a';
//            Node node = curr.children[ind];
//
//            if (node == null) {
//                return false;
//            }
//
//            if (i == key.length() - 1 && curr.children[ind].eow == false) {
//                return false;
//            }
//            curr = curr.children[ind];
//        }
//        return true;
//    }


    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNode(root.children[i]);
            }
        }
        return count + 1;
    }


    public static void main(String[] args) {
        String str = "ababa";
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(countNode(root));
    }

}
