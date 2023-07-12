package Recursion;

public class Print1toN {
    public static void main(String[] args) {
        ans(5);
    }

    public static void ans(int num) {
        if (num == 0){
            return;
        }
        ans(num-1);
        System.out.print(num+" ");

        // to print 5 4 3 2 1 1 2 3 4 5
        System.out.print(num+" ");
        ans(num-1);
        System.out.print(num+" ");


    }
}
