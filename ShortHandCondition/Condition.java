package ShortHandCondition;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter age: ");
        int age = sc.nextInt();


        String result = (age>=18)? "adult": "not adult";
        System.out.println(result);


//        //check weather a number is even or odd
//        System.out.println("enter number: ");
//        int num = sc.nextInt();
//
//        String ans = (num%2==0)? "even" : "odd";
//        System.out.println(ans);
    }
}
