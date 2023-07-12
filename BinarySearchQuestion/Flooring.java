package BinarySearchQuestion;


// Q: Find flooring function of a real number (the Greatest integer number less than or equal to the given number).
public class Flooring {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int ans = search(arr, 2);
        System.out.println(ans);
    }
    public static int search(int[] arr, int target) {


        int start = 0;
        int end = arr.length - 1;


        //if target is less than arr[start]
        if (target < arr[start]) {
            return -1;
        }

        boolean isAscending;
        if (arr[start] < arr[end]) {
            isAscending = true;
        } else {
            isAscending = false;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return end;
    }
}
