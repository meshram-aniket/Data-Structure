package LinearSearch;

import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5},
                {54,653,0,53},
                {8,6}
        };
        int[] ans = search(arr, 0);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
