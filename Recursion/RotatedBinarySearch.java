package Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(BinarySearch(arr, 1, 0, arr.length-1));
    }

    public static int BinarySearch(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;

        if (start > end) {
            return -1;
        }

        if (target == arr[mid]) {
            return mid;
        }

        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return BinarySearch(arr, target, start, mid-1) ;
            }
            else {
                return BinarySearch(arr, target, mid + 1, end);
            }
        }


        else if (target <= arr[mid] && target >= arr[end]) {
            return BinarySearch(arr, target, start+1, end);
        }

        else {
            return BinarySearch(arr, target, start, mid-1);
        }

    }


}


