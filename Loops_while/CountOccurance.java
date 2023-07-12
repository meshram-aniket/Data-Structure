package Loops_while;

import java.util.Scanner;

public class CountOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = 83457377;

        int count = 0;
        while(num > 0) {

            int rem = num % 10;

            if (rem == 1) {
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
