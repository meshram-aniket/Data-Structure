package LinearSearch;

import javax.naming.PartialResultException;
import java.util.Arrays;
public class SearchingInString {
    public static void main(String[] args) {
        String name = "aniket";
        char c = 'a';

        System.out.println(Arrays.toString(name.toCharArray())); // change string into String Arrays
        System.out.println(search(name, c));
    }

    static boolean search(String name, char ch) {
        if (name.length()==0) {
            return false;
        }

        for (int i = 0 ; i < name.length(); i++){
            if (ch==name.charAt(i)) {
                return true;
            }
        }


        //another way
        for (char str: name.toCharArray()){
            if (ch==str) {
                return true;
            }
        }
        return false;
    }
}
