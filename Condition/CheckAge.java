package Condition;

import java.util.Scanner;
public class CheckAge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter an age: ");
        int x = sc.nextInt();

        if (x >= 18) {
            System.out.println("adult");
        }
        else{
            System.out.println("not adult");
        }
    }
}
