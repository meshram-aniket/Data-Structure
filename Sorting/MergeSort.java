package Sorting;

import java.util.Arrays;

import static java.lang.System.arraycopy;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,3,6,100,21,1};
//        System.out.println(Arrays.toString(merge(arr)));
        mergeInSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

//    public static int[] merge(int[] arr) {
//        if (arr.length == 1) {
//            return arr;
//        }
//
//        int mid = arr.length / 2;
//        int[] first = merge(Arrays.copyOfRange(arr, 0, mid));
//        int[] second = merge(Arrays.copyOfRange(arr, mid, arr.length));
//
//        return mergeSort(first, second);
//    }
//
//    private static int[] mergeSort(int[] first, int[] second) {
//        int[] mix = new int[first.length + second.length];
//
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        while(i < first.length && j < second.length) {
//            if (first[i] < second[j]) {
//                mix[k] = first[i];
//                i++;
//                k++;
//            }
//            else {
//                mix[k] = second[j];
//                j++;
//                k++;
//            }
//        }
//
//        // it may be possible the any one of the array is completed
//        while (i< first.length) {
//            mix[k] = first[i];
//            i++;
//            k++;
//        }
//
//        while (j < second.length) {
//            mix[k] = second[j];
//            j++;
//            k++;
//        }
//        return mix;




    // another way
    public static void mergeInSort(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int m = s + (e - s) / 2;
        mergeInSort(arr, s, m );
        mergeInSort(arr, m , e);
        mergeArr(arr, s, m, e);
    }

    public static void mergeArr(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                k++;
                i++;
            }
            else {
                mix[k] = arr[j];
                k++;
                j++;
            }

        }

        // it may be possible that one of the array is completed
        while (i < mid) {
            mix[k] = arr[i];
            k++;
            i++;
        }

        while (j < end) {
            mix[k] = arr[j];
            k++;
            j++;
        }
        arraycopy(mix, 0, arr, start, mix.length);
    }
}

