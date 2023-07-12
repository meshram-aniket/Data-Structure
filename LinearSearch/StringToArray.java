package LinearSearch;


import java.util.Arrays;
import java.util.Scanner;
public class StringToArray {
    public static void main(String[] args) {
        String name = "mehul";
        Scanner sc = new Scanner(System.in);
        System.out.println(Name(name));
    }

    public static String Name(String name) {
        String str = "";
        for (int i = 0; i < name.length(); i++) {
             str = Arrays.toString(name.toCharArray());
        }
        return str;



    }
}