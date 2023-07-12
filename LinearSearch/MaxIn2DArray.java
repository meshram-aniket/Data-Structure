package LinearSearch;

import java.util.Arrays;

public class MaxIn2DArray {

        public static void main(String[] args) {
            int[][] arr = {
                    {1,3,5},
                    {54,653,0,53},
                    {8,6}
            };
            int ans = max(arr);
            System.out.println(ans);
        }

        public static int max(int[][] arr) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (max < arr[i][j]) {
                        max = arr[i][j];
                    }
                }
            }
            return max;

        }
}
