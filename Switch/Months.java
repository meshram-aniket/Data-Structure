package Switch;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter month: ");
        String month = sc.nextLine();

        switch(month) {
            case "January" :
                System.out.println("1");
                break;
            case "February" :
                System.out.println("2");
                break;
            case "march" :
                System.out.println("3");
                break;
            case "April" :
                System.out.println("4");
                break;
            case "May" :
                System.out.println("5");
                break;
            case "June" :
                System.out.println("6");
                break;
            case "July" :
                System.out.println("7");
                break;
            case "August" :
                System.out.println("8");
                break;
            case "September" :
                System.out.println("9");
                break;
            case "Octomber" :
                System.out.println("10");
                break;
            case "November" :
                System.out.println("11");
                break;
            case "December" :
                System.out.println("12");
                break;
            default:
                System.out.println("invalid month");
        }

        switch (month) {
            case "January" -> System.out.println("1");
            case "February" -> System.out.println("2");
            case "march" -> System.out.println("3");
            case "April" -> System.out.println("4");
            case "May" -> System.out.println("5");
            case "June" -> System.out.println("6");
            case "July" -> System.out.println("7");
            case "August" -> System.out.println("8");
            case "September" -> System.out.println("9");
            case "Octomber" -> System.out.println("10");
            case "November" -> System.out.println("11");
            case "December" -> System.out.println("12");
            default -> System.out.println("invalid month");
        }
    }
}
