package Recursion;

public class Pattern {
    public static void main(String[] args) {
        printStar(5,0);

    }

    public static void printStar(int row, int col) {
        /*
         * * * * *
         * * * *
         * * *
         * *
         *

         */


        if (row == 0) {
            return;
        }

        if (col < row) {
            System.out.print("*");
            printStar(row, col+1);
        }
        else {
            System.out.println();
            printStar(row-1, 0);
        }


        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         */

        if (row == 0) {
            return;
        }

        if (col < row) {
            printStar(row, col+1);
            System.out.print("*");
        }
        else {
            printStar(row-1, 0);
            System.out.println();
        }


    }
}
