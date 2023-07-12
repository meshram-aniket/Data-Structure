package Loops_for;

import java.util.Scanner;

//print no from 1 - 5
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i<=num; i++) {
            System.out.print(i+" ");
        }
    }
}
