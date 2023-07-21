package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Introduction {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // method to add element in hashset
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        System.out.println(set);


        // to get the size of hashset
        System.out.println(set.size());


        // to check whether hashset is empty or not
        if (set.isEmpty()) {
            System.out.println("empty");
        }
        else {
            System.out.println("not empty");
        }


        // to check whether is contains or not
        if (!set.contains(3)) {
            System.out.println("contain");;
        }

        if (set.contains(9)) {
            System.out.println("not contain");
        }


        // to traverse the hashset
        Iterator it = set.iterator();;

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();



        // to remove
        set.remove(3);
        System.out.println(set);



        // to clear the hashset
        set.clear();
        System.out.println(set);
    }
}
