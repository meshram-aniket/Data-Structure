package InputOutput;

import java.util.Scanner;
public class Tempreature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the tempreature: ");
        float tempC = sc.nextFloat();

        float tempF = (tempC* 9/5)+32;
        System.out.println(tempF);

    }
}
