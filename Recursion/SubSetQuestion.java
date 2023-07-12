package Recursion;

import java.util.ArrayList;

// this pattern of taking some element and removing some is known as subset
public class SubSetQuestion {
    public static void main(String[] args) {
        String str = "abc";
        set(" ", str);

        System.out.println(set1("", str));
    }

    public static void set(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        set(p, up.substring(1));
        set(p+ch, up.substring(1));


        // return arraylist of string
    }
    public static ArrayList<String> set1(String p, String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = set1(p, up.substring(1));
        ArrayList<String> right = set1(p+ch, up.substring(1));
        right.addAll(left);
        return right;
    }
}
