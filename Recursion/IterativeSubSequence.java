package Recursion;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class IterativeSubSequence {
    public static void main(String[] args) {
        int[] num = {1, 2, 2};
        ArrayList<ArrayList<Integer>> ans = subset(num);
        for (ArrayList<Integer> list: ans) {
            System.out.println(list);
        }
    }

    public static ArrayList<ArrayList<Integer>> subset(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        // current and previous element is same, s = e + 1

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]){
                start = end + 1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}

