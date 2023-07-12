package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,8,9,23};
        selectionSort(arr, arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr, int row, int col, int max) {

        if (row == 0) {
            return;
        }
        if (row > col) {
            if (arr[max] < arr[col]) {
                selectionSort(arr, row, col + 1, col);
            } else {
                selectionSort(arr, row, col + 1, max);
            }
        }
        else {
            int temp = arr[max];
            arr[max]= arr[row-1];
            arr[row-1] = temp;
            selectionSort(arr, row-1, 0, 0);
        }


    }
}
