package Recursion;

public class Palindrome {
    public static void main(String[] args) {
        int num = 1234421;
        System.out.println(isPalin(num));
    }

    static int sum = 0;
    public static int rev(int num) {
        if (num == 0) {
            return sum;
        }
        int rem = num % 10;
        sum = sum * 10 + rem;
        return rev(num / 10);
    }

    public static boolean isPalin(int num) {
        return num == rev(num);
    }

}
