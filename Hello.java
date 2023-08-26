import java.util.*;

public class Hello {
    public static void main(String[] args) {

        System.out.print( "0 1 ");
        fibonachi(0,1,0,5);
        reverse(0);

    }


    public static void fibonachi(int a, int b, int sum, int n) {
        if (n == 0) {
            return;
        }

        sum = a + b;
        System.out.print(sum + " ");
        fibonachi(b, sum, 0, n - 1);
    }

    public static void reverse(int num) {
        if (num == 5) {
            System.out.println(num);
            return;
        }

        reverse(num + 1);
        System.out.println(num);
    }
}

