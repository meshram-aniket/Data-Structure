package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(fact(num));
    }

    public static int fact(int num) {
        if (num == 1) {
            return num;
        }

        return num * fact(num-1);


    }
}
