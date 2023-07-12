package BinarySearchQuestion;


// The ceiling function of a real number (the least integer number greater than or equal to the given number).

public class FindCeilingOfNum {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int ans = search(arr, 14);
        System.out.println(ans);
    }
    public static int search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // if target is >= arr[end]
        if (target > arr[end]) {
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
                    return arr[mid];
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return arr[mid];
                }
            }
        }
        return start;
    }
}
