package LinearSearch;

import java.util.Arrays;

public class ArraystoString {
    public static void main(String[] args) {
        char[] ch = {'m','e','h','u','l','m','e','s','h','r','a','m'};
        System.out.println(toStr(ch));
    }

    public static String toStr(char[] ch) {
        String str = String.valueOf(ch);
        return str;
    }
}
