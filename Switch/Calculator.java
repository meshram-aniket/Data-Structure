package Switch;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter x: ");
        int x = sc.nextInt();
        System.out.print("enter y: ");
        int y = sc.nextInt();
        System.out.print("for addition enter 1\nfor substraction enter 2\nfor multiplication enter 3\nfor division enter 4\n");

        System.out.print("enter a operation: ");
        int operation = sc.nextInt();

        switch (operation) {
            case 1:
                System.out.println("the answer is: " + x + y);
                break;
            case 2:
                System.out.println("the answer is: " + (x - y));
                break;
            case 3:
                System.out.println("the answer is: " + (x * y));
                break;
            case 4:
                System.out.println("the answer is: " + (x / y));
                break;
            default:
                System.out.println("enter a valid operation");
                break;
        }

        switch (operation) {
            case 1 -> System.out.println("the answer is: " + x + y);
            case 2 -> System.out.println("the answer is: " + (x - y));
            case 3 -> System.out.println("the answer is: " + (x * y));
            case 4 -> System.out.println("the answer is: " + (x / y));
            default -> System.out.println("enter a valid operation");
        }

        if (operation == 1) {
            System.out.println("the answer is: " + x + y);
        } else if (operation == 2) {
            System.out.println("the answer is: " + (x - y));
        } else if (operation == 3) {
            System.out.println("the answer is: " + (x * y));
        } else if (operation == 4) {
            System.out.println("the answer is: " + (x / y));
        } else {
            System.out.println("enter a valid operation");
        }
    }
}
