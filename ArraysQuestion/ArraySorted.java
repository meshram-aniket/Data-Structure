package ArraysQuestion;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class ArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size = sc.nextInt();
        System.out.println("enter array: ");
        int[] arr = new int[size];
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        isSorted(arr);
    }

    public static void isSorted (int[] arr) {
        boolean isAscending = true;
        for (int i = 0 ; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("Ascending order");
        }
        else {
            System.out.println("not in Ascending order");
        }
    }
}
