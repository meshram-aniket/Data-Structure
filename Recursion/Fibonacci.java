package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo1(7));
        fibo(1, 0,1);
    }

    public static int fibo1 (int num) {
        if (num < 2) {
            return num;
        }
        return fibo1(num-1) + fibo1(num-2);
    }

    public static void fibo(int n, int start, int end) {
        int sum = start + end;
        if (n == 5) {
            System.out.println(sum);
            return;
        }
        System.out.println(sum);
        fibo(n+1, end, sum);
    }
}
