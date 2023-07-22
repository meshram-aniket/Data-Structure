package HashMap;

import java.util.HashSet;

// intersection of 2 arrays
public class Intersection_two_array {
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};
        Intersection_two_array arr = new Intersection_two_array();
        System.out.println(arr.intersection(arr1, arr2));

    }


    public int intersection(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                System.out.print(arr2[i] + " ");
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println();

        System.out.print("Intersection : ");
        return count;
    }
}
