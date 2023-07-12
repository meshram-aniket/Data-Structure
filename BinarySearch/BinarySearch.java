package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {233,212,32,23,11,3,1,1};
        int ans = search(arr, 1);
        System.out.println(ans);
    }


    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;



        // check weather array is sorted in ascending or descending order
        boolean isAscending;

        if (arr[start] < arr[end]) {
            isAscending = true;
        }
        else {
            isAscending = false;
        }



        while (start <= end) {
            // value of start and end is updating inside this block that's why we make mid variable inside the block
            int mid = (end + start) / 2;

            // if order is ascending then do this
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }

            // if the order is descending then do this
             else  {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }

        // if element not found then print -1;
        return -1;
    }
}
