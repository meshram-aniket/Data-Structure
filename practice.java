import LinkList.Question.Palindrome;
import Trees.BST.deleteNode;

import java.util.*;
public class practice {

    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        System.out.println(union(arr, k));
    }


    public static int union (int[] arr, int k) {
        HashMap<Integer, Integer> set = new HashMap<>();
        set.put(0, 1);
        int sum = 0;
        int freq = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (set.containsKey(sum)) {
                set.put(sum, set.get(sum) + 1);
            }

            else {
                set.put(sum, 1);
            }


            if (set.containsKey(sum - k)) {
                freq += set.get(sum - k);
            }
        }
        System.out.println(set);
        return freq;

    }

//    public static void count(HashMap<Integer, Integer> map, int n) {
//
//    }
}
