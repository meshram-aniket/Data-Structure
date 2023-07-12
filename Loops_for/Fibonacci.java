package Loops_for;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 1 ; i <= num-2 ; i++) {
            int fibo = a + b;
            a = b;
            b = fibo;
            System.out.println(fibo);
        }
    }
}
