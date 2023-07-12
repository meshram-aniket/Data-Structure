package Loops_while;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= num){
            int fibo = a + b;
            System.out.println(fibo);
            a = b;
            b = fibo;
            count++;
        }
    }
}
