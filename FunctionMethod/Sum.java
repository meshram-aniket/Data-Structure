package FunctionMethod;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum(3,3);
        System.out.println(ans);
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
