package Recursion;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6};
        System.out.println(isSorted(arr,0));
    }

    public static boolean isSorted(int[] arr, int num) {
        if (num == arr.length-1) {
            return true;
        }

//        if (arr[num] < arr[num+1]) {
//            return isSorted(arr, num+1);
//        }
        return arr[num] < arr[num+1] && isSorted(arr, num+1);
    }
}
