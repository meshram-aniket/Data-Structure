package MultiArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //  initialisation
        for (int i = 0; i < 4 ; i++) {
            list.add(new ArrayList<>());
        }

//         add elements
        for (int i = 0;  i < 4; i++) {
            for (int j = 0; j < 4; j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
        System.out.println();







        int n = 3;

        // Here aList is an ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>(n);

        // Create n lists one by one and append to the
        // master list (ArrayList of ArrayList)
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        aList.add(a1);

        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(5);
        aList.add(a2);

        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(10);
        a3.add(20);
        a3.add(30);
        aList.add(a3);


        for(int i = 0; i < aList.size(); i++){
            for (int j = 0 ; j < aList.get(i).size(); j++){
                System.out.print(aList.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }
}
