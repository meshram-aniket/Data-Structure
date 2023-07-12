package LinearSearch;

public class Solution {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {3,2,5}
        };
        System.out.println(findWealth(arr));
    }


    public static int findWealth(int[][] arr) {
        int max = 0;

        for (int[] a:arr) {
            int sum = 0;
            for (int b: a) {
                sum += b;
            }

            if (max<sum) {
                max = sum;
            }
        }

        return max;
    }
}
