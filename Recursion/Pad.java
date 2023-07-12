package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Pad {
    public static void main(String[] args) {
        pad("", "12");
        System.out.println(letterCombination("", "12"));
    }

    public static void pad (String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char) ('a' + i);
            pad(p+ch, up.substring(1));
        }
    }

    public static List<String> letterCombination(String p, String up) {
        if (up.isEmpty()) {
            List<String> ans =  new ArrayList<>();
            ans.add(p);
            return ans;
        }

        List<String> list = new ArrayList<>();
        int digit = up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char) ('a' + i);
            list.addAll(letterCombination(p+ch, up.substring(1)));
        }
        return list;
    }
}
