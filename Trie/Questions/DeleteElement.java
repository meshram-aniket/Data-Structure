package Trie.Questions;

public class DeleteElement {
    static class Node {
        Node[] children;
        boolean eow;
        Node() {
            children = new Node[26];
            eow = false;
        }

    }

    static Node root = new Node();
    public static void insert(String word) {
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



    public static boolean delete(String key) {
        Node curr = root;

        for (int i = 0; i < key.length(); i++) {
            int ind = key.charAt(i) - 'a';

            if (curr.children[ind] == null) {
                return false;
            }

            if (i == key.length() - 1 && curr.children[ind].eow == true) {
                curr.children[ind].eow = false;
            }
            curr = curr.children[ind];
        }
        return true;

    }



    public static void main(String[] args) {
        String[] words = {"banana", "apple", "orange", "watermelon", "kiwi"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println("find the element? : " + search("apple"));
        System.out.println("deleted the element?: " + delete("apple"));
        System.out.println("find the element?: " + search("apple"));
    }
}
