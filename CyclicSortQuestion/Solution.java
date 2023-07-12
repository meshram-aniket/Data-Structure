package CyclicSortQuestion;

import java.util.Arrays;
public class Solution {
    public static void main(String[] args) {
        int[] arr = {4,2,5,3,1};
        sort(arr);
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }


}
