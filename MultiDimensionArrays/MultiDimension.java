package MultiDimensionArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
        */

        int[][] arr = new int[5][];  //adding no. of row is mandatory, column is not

        int[][] arr2 = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                        };


        int[][] arr3 = {
                {1,2,3},   // 0th index
                {4,5},   // 1st index
                {7,8,9,10}   // 2nd index
        };

        for (int row = 0; row < arr3.length; row++ ) {
            for (int col = 0; col < arr3[row].length; col++){
                System.out.print(arr3[row][col]+" ");
            }
            System.out.println();
        }


        // input
        Scanner sc = new Scanner(System.in);
        int[][] arr4 = new int[4][3];
        for (int row = 0; row < arr4.length; row++) {
            // for each column in every row
            for (int col = 0; col< arr4[row].length; col++) {
                arr4[row][col]=sc.nextInt();
            }
        }


        // output
        for (int row = 0; row < arr4.length; row++) {
            for (int col = 0; col < arr4[row].length; col++) {
                System.out.print(arr4[row][col]+" ");
            }
            System.out.println();
        }


        for (int row = 0; row < arr4.length; row++) {
            System.out.println(Arrays.toString(arr4[row]));
        }

        System.out.println(" ");
        System.out.println(" ");

        // enhanced for loop
        for (int[] a : arr4) {
            System.out.println(Arrays.toString(a));
        }
    }
}
