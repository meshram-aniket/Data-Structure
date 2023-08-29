import java.util.*;

public class Hello {
    public static void main(String[] args) {

        System.out.print( "0 1 ");
        fibonachi(0,1,0,5);
        reverse(0);
        System.out.println(factorial(5));
        perfect(1234);

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



    static int fact = 1;
    public static int factorial(int num) {
        if (num == 0) {

            return 1;
        }

        fact = fact * num;
        factorial(num - 1);
        return fact;
    }


    static int sum = 0;
    public static void perfect(int num) {
        if (num == 0) {
            System.out.println(sum);
            return ;
        }


        int rem = num % 10;
        sum = (10*sum)+rem;
        perfect(num / 10);
    }
}

