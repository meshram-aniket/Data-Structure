package Switch;

import java.util.Scanner;

public class Weekends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = sc.nextInt();


        //enhanced switch
        switch (number) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekdays");
            case 6, 7 -> System.out.println("weekends");
        }


        //if-else condition
        if (number == 1 || number == 2 || number == 3 || number == 4 || number == 5) {
            System.out.println("weekdays");
        } else if (number == 6 || number == 7) {
            System.out.println("weekends");
        }


        //simple switch
        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekdays");
                break;
            case 6:
            case 7:
                System.out.println("weekends");
                break;
        }
    }
}
