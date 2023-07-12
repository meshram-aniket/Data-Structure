package Condition;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter anything");
        char c = sc.next().charAt(0);
        String ch = sc.next();
        int ans = ch.charAt(0);

        if (ans >= 'a' && ans <= 'z') {
            System.out.println("lower case");
        }

        else {
            System.out.println("upper case");
        }

    }
}
