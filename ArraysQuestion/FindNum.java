package ArraysQuestion;

import java.util.Scanner;

public class FindNum {
    public static void main(String[] args) {
        int[] bb = {1,4,6,7,3,4,7,3,5,3,7,7,6,10,33};
        find(bb);
    }

    static void find(int[] bb) {
        System.out.print("enter an num: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0 ; i < bb.length; i++) {
            if (bb[i]==num) {
                System.out.print(i+" ");
//                break;              // to find first occur at which index
            }

        }
    }
}
