package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(32);
        list.add(87);
        list.add(32);
        list.add(36);
        list.add(378);
        list.add(34);
        list.add(97);
        list.add(36);
        list.add(39);
        list.add(33);
        list.add(32);
        list.add(32);
        list.add(11);
        list.add(22);
        list.add(64);

        // output
        System.out.println(list);

        // to sort the array
        Collections.sort(list);
        System.out.println(list);

        // to get the size
        System.out.println(list.size());

        // check wheather the list contain
        System.out.println(list.contains(39));

        // set the value element
        list.set(0, 100);
        System.out.println(list);


        // remove
        list.remove(5);
        System.out.println(list);


        // get the list till index
        for (int i =0 ; i < 5; i++) {
            System.out.print(list.get(i)+" ");  //pass  index here; list[index] syntax will not work here

        }
        System.out.println();
        System.out.println(list);


        //  input
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            list1.add(sc.next());
        }

        System.out.println(list1);


        // getting item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list1.get(i));
        }
        System.out.println(list1);
    }
}
