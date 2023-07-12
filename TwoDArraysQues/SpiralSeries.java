package TwoDArraysQues;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int[] a: arr){
            System.out.println(Arrays.toString(a)
            );
        }

        int rowStart = 0;
        int rowEnd = m-1;
        int colStart = 0;
        int colEnd = n-1;

        while(rowStart<=rowEnd && colStart<=colEnd) {

            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(arr[rowStart][col]+" ");
            }
            rowStart++;


            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(arr[row][colEnd]+" ");
            }
            colEnd--;


            for (int col = colEnd; col >= colStart; col--) {
                System.out.print(arr[rowEnd][col]+" ");
            }
            rowEnd--;


            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(arr[row][colStart]+" ");
            }
            colStart++;

        }
    }
}
