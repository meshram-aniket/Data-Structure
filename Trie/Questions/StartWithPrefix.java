package Trie.Questions;

public class StartWithPrefix {
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


    public static boolean startWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int ind = prefix.charAt(i) - 'a';


            if (curr.children[ind] == null) {
                return false;
            }
            curr = curr.children[ind];
        }

        return true;
    }


    public static void main(String[] args) {
        String[] word = {"apple", "app", "mango", "man", "woman"};
        String prefix = "man";
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }

        System.out.println(startWith(prefix));
    }
}
