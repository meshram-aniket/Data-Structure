package Trie.Questions;

public class Searching_element {
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


    // searching
    public static boolean search(String key) { //O(n)
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int ind = key.charAt(i) - 'a';
            Node node = curr.children[ind];

            if (node == null) {
                return false;
            }

            if (i == key.length() - 1 && curr.children[ind].eow == false) {
                return false;
            }
            curr = curr.children[ind];
        }
        return true;
    }


    public static void main(String[] args) {
        String[] word = {"the", "a", "there", "their", "any", "thee"};
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
//            System.out.println("insert : " + word[i]);
        }


        System.out.println(search("b"));

    }

}
