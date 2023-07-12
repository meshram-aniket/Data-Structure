package TwoDArraysQues;

import java.util.Arrays;
import java.util.Scanner;

public class Transpose {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter a row: ");
        int row = sc.nextInt();
        System.out.println("enter a col: ");
        int col = sc.nextInt();
        System.out.println("enter a array: ");
        int[][] ar = new int[row][col];
        for (int i = 0 ; i < row; i++){
            for (int j = 0 ; j < col; j++) {
                ar[i][j] = sc.nextInt();
            }
        }

        for (int j = 0 ; j < col; j++){
            for (int i = 0 ; i < row; i++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] a: ar){
            System.out.println(Arrays.toString(a));
        }
    }
}
