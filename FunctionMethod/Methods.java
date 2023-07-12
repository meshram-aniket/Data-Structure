package FunctionMethod;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);

    }
    public static boolean isPrime (int n) {

        if (n <= 1) {
            return false;
        }
        int c = 2;
        while(c < n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
