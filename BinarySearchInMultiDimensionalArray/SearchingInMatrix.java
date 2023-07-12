package BinarySearchInMultiDimensionalArray;

import java.util.Arrays;

public class SearchingInMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {11,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr, 49)));
    }

    public static int[] search(int[][] arr, int target) {
        int r = 0;
        int c = arr.length-1;

        while (r <= arr.length-1 && c >= 0) {
            if (arr[r][c] == target) {
                return new int[]{r,c};
            }

            if (arr[r][c] > target) {
                c--;
            }

            if (arr[r][c] < target) {
                r++;
            }
        }
        return new int[]{-1,-1};
    }

}
