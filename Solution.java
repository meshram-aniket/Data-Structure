import javax.management.JMRuntimeException;
import java.util.Arrays;

import static java.lang.System.*;

public class Solution {
    public static void main(String[] args) {
       int[] arr = {4,2,5,3,1,7};
       merger(arr, 0, arr.length-1);
       System.out.println(Arrays.toString(arr));
    }

    public static void merger(int[] arr, int low, int high) {
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        if (start >= end) {
            return;
        }

        while (start <= end) {
            while (pivot < arr[end]) {
                end--;
            }
            while (pivot > arr[start]) {
                start++;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        merger(arr, low , end);
        merger(arr, start, high);
    }
}