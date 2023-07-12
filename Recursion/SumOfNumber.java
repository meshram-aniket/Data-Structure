package Recursion;

public class SumOfNumber {
    public static void main(String[] args) {
        int n = 123456789;
        System.out.println(sum(n));
    }
    public static int sum (int number) {
        if (number == 0) {
            return 0;
        }
        return (number % 10) + sum(number / 10);

    }
}
