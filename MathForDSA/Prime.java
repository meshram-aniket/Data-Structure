package MathForDSA;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
//        for (int i = 1; i <= num; i++) {
//            System.out.println("isPrime = "+isPrime(i));
//        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        int c = 2;
        while(c * c <= num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
