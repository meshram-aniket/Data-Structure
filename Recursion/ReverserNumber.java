package Recursion;

public class ReverserNumber {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(reverse(num));
    }

    static int sum = 0;
    public static int reverse( int number) {
//        // one way
//        if (number == 0) {
//            return sum;
//        }
//        int temp = (number % 10);
//        sum = sum * 10 + temp;
//
//        return reverse(sum,number / 10);


        // second way

        int digits = (int)(Math.log10(number)+1);
        return helper(number, digits);


    }

    public  static int helper(int number, int digits) {
        if(number% 10 == number) {
            return number;
        }
        int rem = number % 10;
        return rem*(int)(Math.pow(10, digits-1))+helper(number/10, digits-1);
    }
}
