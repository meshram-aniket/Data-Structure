package Sorting;

import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-1,-4,0,4,3,5};
        sort(arr);
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length -1 -i;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int getMaxIndex(int[] arr, int first, int last) {
        int max = first;
        for (int i = first; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap (int[] arr, int start, int last) {
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }

}
