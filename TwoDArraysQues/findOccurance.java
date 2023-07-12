package TwoDArraysQues;

import java.util.Scanner;
import java.util.Arrays;
public class findOccurance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a row: ");
        int row = sc.nextInt();
        System.out.println("enter a col: ");
        int col = sc.nextInt();

        int[][] arrs = new int[row][col];
        System.out.println("enter a matrix: ");
        for (int i = 0 ; i < row; i++) {
            for (int j = 0 ; j < col; j++) {
                 arrs[i][j] = sc.nextInt();
            }
        }
        for (int[] a: arrs) {
            System.out.println(Arrays.toString(a));
        }
        find(arrs);
    }

    public static void find (int[][] arr) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num to find the position: ");
        int num = sc.nextInt();
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 0 ; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    System.out.println("array found at ("+i+", "+j+")");
                }
            }
        }
    }
}
