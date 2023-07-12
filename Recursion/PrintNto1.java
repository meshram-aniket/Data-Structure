package Recursion;

public class PrintNto1 {
    public static void main(String[] args) {
        num(5);
    }

    public static void num (int num) {
        if (num == 0) {
            return;
        }

        System.out.print(num+" ");
        num(num-1);
    }
}
