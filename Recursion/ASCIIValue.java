package Recursion;

import java.util.ArrayList;

public class ASCIIValue {
    public static void main(String[] arr) {
        String str = "abc";
        System.out.println(set1("", str));
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
        ArrayList<String> middle = set1(p+(ch+0), up.substring(1));
        right.addAll(left);
        right.addAll(middle);
        return right;
    }
}
