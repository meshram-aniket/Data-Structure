package Switch;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("sasriyakal");
                break;
            case 4:
                System.out.println("khamma ghani");
                break;
            default:
                System.out.println("invalid condition");
        }
    }
}
