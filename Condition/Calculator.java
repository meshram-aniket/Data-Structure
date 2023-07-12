package Condition;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a operator: ");
        char op = sc.next().trim().charAt(0);
        int ans = 0;

        while(true) {
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.println("enter a two no ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    ans = a / b;
                }
            } else if (op == 'X' || op == 'x') {
//                System.out.println();
                break;

            } else {
                System.out.println("invalid operation");
            }

            System.out.println(ans);
        }
    }
}
