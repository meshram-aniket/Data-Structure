package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,4,2,1,5,7,8};

        System.out.println(Search(arr, 2, 0));
    }

    public static int Search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (target == arr[index]) {
            return index;
        }
        return Search(arr, target, index + 1);
    }

}
