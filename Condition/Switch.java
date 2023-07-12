package Condition;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number from 1 - 3 : ");
        int button = sc.nextInt();

        if (button==1) {
            System.out.println("hello");
        }
        else if (button==2) {
            System.out.println("konichiwa");
        }
        else if (button==3) {
            System.out.println("namaste");
        }
        else {
            System.out.println("invalid button");
        }
    }
}
