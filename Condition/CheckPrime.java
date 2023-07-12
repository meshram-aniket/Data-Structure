package Condition;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = sc.nextInt();


        if (number >= 1) if (number % 2 == 0 || number % 3 == 0) {
            System.out.println("not prime");
        } else {
            System.out.println("prime");

        }
        else {
            System.out.println("invalid number");
        }

    }
}
