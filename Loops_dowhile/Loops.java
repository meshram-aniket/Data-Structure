package Loops_dowhile;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        int num = 1;
//        do {
//            System.out.println("hello world");
//            num++;
//        }while (num != 4);

        Scanner sc = new Scanner(System.in);

        int input;
        do {

            System.out.println("enter a marks: ");
            int marks = sc.nextInt();
            if (marks>100){
                System.out.println("enter marks under 100");
            }
            else if (marks>=90 && marks<=100){
                System.out.println("excellent");
            }
            else if (marks>=80 && marks<90) {
                System.out.println("very good");
            }
            else if (marks>=70 && marks<80) {
                System.out.println("good");
            }
            else {
                System.out.println("not bad");
            }
            System.out.println("do you want to enter yes(1) of No(0)? ");
            input = sc.nextInt();
        }
        while(input == 1);
    }
}
