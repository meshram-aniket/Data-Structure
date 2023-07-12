package Recursion;

public class Practice {
    public static void main(String[] args) {
        int num = 6;
        int[] arr = {2,3,4,5,6,7,8,9};
        System.out.println(BS(4, arr, 0, arr.length-1));
    }

    public static int BS(int target, int[] arr, int start, int end) {
        if (start > end) {
            return -1;
        }


            int mid = start - (end + start) /2;
            if (target > arr[mid]) {
                return BS(target, arr, mid+1, end);
            }
            else {
                return BS(target, arr, start, mid-1);
            }



    }
}
