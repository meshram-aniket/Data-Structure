package Recursion;

import java.util.ArrayList;

public class FindAllIndexLinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 2, 7, 2};
        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(Search(arr, 2, 0, list));
        System.out.println(Search(arr, 2, 0));
    }



//    public static ArrayList<Integer> Search(int[] arr, int target, int index, ArrayList<Integer> list) {
//        if (index == arr.length) {
//            return list;
//        }
//
//        if (target == arr[index]) {
//            list.add(index);
//        }
//
//        return Search(arr, target, index + 1, list);
//    }



    // another way
    static ArrayList<Integer> list = new ArrayList<>();
    public static ArrayList<Integer> Search(int[] arr, int target, int index) {

        if (index == arr.length) {
            return list;
        }

        if (target == arr[index]) {
            list.add(index);
        }
        return Search(arr, target, index + 1);
    }


}

