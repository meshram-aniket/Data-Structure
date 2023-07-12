package StringBuilder;

import java.util.Arrays;
public class Strings {
    public static void main(String[] args) {
        String firstName = "Aniket";
        String lastName = "Meshram";

        // concatination
        System.out.println(firstName+" "+lastName);


        // find the length of string
        System.out.println(firstName.length());


        // find character at
        for (int i = 0; i < firstName.length(); i++) {
            System.out.print(firstName.charAt(i)+" ");
        }


        // compare two strings

                 //   name1 > name2: +ve value;
                 //   name1 < name2: -ve value;
                 //   name1 = name2 = 0;

        String name1 = "aniket";
        String name2 = "aniket6";
        if(name1.compareTo(name2) < 0) {
            System.out.println("name1 is smaller");
        }
        else if (name1.compareTo(name2) > 0) {
            System.out.println("name1 is greater");
        }
        else {
            System.out.println("name1 is equal");
        }

        // to print substring from string
        String sentence = "eat, sleep and code";
        String ans = sentence.substring(3, sentence.length()); // print sentence from starting index to ending index - 1
        String ans2 = sentence.substring(0, 3+1);
        System.out.println(ans);
        System.out.println(ans2);


        // Strings are immutable

        //means if we create string then we cannot modified it
        StringBuilder sb = new StringBuilder("aniket");
        StringBuilder sb1 = new StringBuilder("aniketmeshram");
        sb.append('b');

        sb.appendCodePoint(2);

        int cap = sb.capacity();

//        sb.reverse();
        sb.replace(2,4,"jaan");  // last index is non inclusive
        sb.trimToSize();

        boolean result = sb.isEmpty();
        sb.insert(0, 'c');
        sb.setCharAt(0,'z');
        System.out.println(sb);
        System.out.println(cap);
        System.out.println(result);
    }
}

