package BinarySearchQuestion;

public class FindPeakIndex {
    public static void main(String[] args) {
        int[] arr = {4,4,5,6,7,3,2,1};
        System.out.println(search(arr));
    }

    public static int search (int[] arr) {
        int start = 0 ;
        int end = arr.length-1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }

            else {
                end = mid;
            }
        }
        return start;
    }
}

