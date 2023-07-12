package Condition;

//find the largest of 2 number
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num 1: ");
        int num1 = sc.nextInt();
        System.out.print("enter num 2: ");
        int num2 = sc.nextInt();
        System.out.print("enter num 3: ");
        int num3 = sc.nextInt();


//        if(num1==num2) {
//            System.out.println("both are equal ");
//        }
//        else if(num1>num2) {
//            System.out.println("num1 is greater than num2");
//        }
//        else {
//            System.out.println("num2 is greater than num1");
//        }


        if (num1 == num2 && num1 == num3) {
            System.out.println("all are equal value");
        }
        else if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is greaater");
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 is greaater");
        }
        else{
            System.out.println("num3 is greater");
        }
    }

}
