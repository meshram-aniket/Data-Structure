import java.util.*;

public class Hello {
    public static void main(String[] args) {
    
        System.out.print( "0 1 ");
        fibonachi(0,1,0,5);

    }


    public static void fibonachi(int a, int b, int sum, int n) {
        if (n == 0) {
            return;
        }

        sum = a + b;
        System.out.print(sum + " ");
        fibonachi(b, sum, 0, n - 1);
    }
}

