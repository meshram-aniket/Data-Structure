package Recursion;

public class ProductOfNumber {
    public static void main(String[] args) {
        int n = 123456789;
        System.out.println(sum(n));
    }
    public static int sum (int number) {
        if (number == 1) {
            return 1;
        }
        return (number % 10) * sum(number / 10);

    }
}
