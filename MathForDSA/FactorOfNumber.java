package MathForDSA;

import java.util.ArrayList;
import java.util.Collections;

public class FactorOfNumber {
    public static void main(String[] args) {
        factorial(20);
        factorial2(20);

    }


//    O(n)
    public static void factorial(int num){
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i+" ");
            }
        }
    }


    // O(sqrt(n))
    public static void factorial2(int num){
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (num / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + num / i + " ");
                }
            }
        }
    }
}
