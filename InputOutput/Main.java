package InputOutput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the name: ");
        String name = sc.next();
        int num = sc.nextInt();
        float nm = sc.nextFloat();
        boolean b = sc.nextBoolean();
        long l = sc.nextLong();
//        char c = sc.next();

        System.out.println(name);
    }
}
