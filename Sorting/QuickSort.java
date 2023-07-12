package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr= {24, 9, 29, 14, 19, 27};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
         int start = low;
         int end = high;
         int mid = start + (end - start)/2;
         int pivot = arr[mid];

         while(start <= end) {
             while (pivot < arr[end]){
                 end--;
             }
             while (pivot > arr[start]){
                 start++;
             }

             if (start <= end) {
                 int temp = arr[end];
                 arr[end] = arr[start];
                 arr[start] = temp;
                 end--;
                 start++;
             }
         }
        sort(arr, low, end);
        sort(arr, start, high);
    }
}
