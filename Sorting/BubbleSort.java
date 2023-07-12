package Sorting;

import java.util.Arrays;
public class BubbleSort  {
    public static void main(String[] args) {
        int[] arr = {4,3,5,6,2,1};
        sort(arr);
    }

    public static void sort (int[] arr) {
        boolean swapped;
        int end = arr.length;
        for (int i = 0; i < arr.length-1; i++) {
            swapped = false;
            for (int j = 0 ; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped = true;
                }
            }

            if(!swapped) {  // time complexity O(n)
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
