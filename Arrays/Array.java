package Arrays;


import java.util.Scanner;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        System.out.println(arr[0]);  // 0
//
//        String[] str = new String[6];
//        System.out.println(str[4]);  //null


        // take input
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//
//        System.out.println(Arrays.toString(arr));

//        // print output
//        for (int j = 0; j < arr.length; j++) {
//            System.out.print(arr[j]);
//        }
//
//        // for each loop
//        for(int num: arr) {  // for every element in array, print the element
//            System.out.print(num);  // here num represents the element of the array
//        }


        int[] arrs = {1,2,3,4,5};
        System.out.println(Arrays.toString(arrs));
        change(arrs);
        System.out.println(Arrays.toString(arrs));
    }

   public static void change(int[] arrs) {
        arrs[3]=23;
   }
}
