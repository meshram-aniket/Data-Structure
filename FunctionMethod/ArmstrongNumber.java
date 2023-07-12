package FunctionMethod;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 153;
//        boolean ans = isArmstrong(n);
        for (int i = 100; i<=999; i++) {
            if (isArmstrong(i)){
                System.out.print(i +" ");
            }
        }

    }

    static boolean isArmstrong(int n) {
        int sum = 0;
        int original = n;
        while(n>0) {
            int temp = n % 10;
            sum = sum+( temp*temp*temp);
            n = n/10;
        }
        if (original == sum) {
            return true;
        }
        return false;
    }

}
