package Recursion;

public class skipChar {
    public static void main(String[] args) {
        String str = "aabsfka";
//        skipped(" ", str);
        System.out.println(skip(str, " "));
    }

//    public static void skipped(String ans, String up){
//        if (up.isEmpty()) {
//            System.out.print(ans);
//            return;
//        }
//
//        char ch = up.charAt(0);
//        if (ch == 'a'){
//            skipped(ans, up.substring(1));
//        }
//        else {
//            skipped(ans + ch, up.substring(1));
//        }
//
//    }


    public static String skip(String up, String p) {
        if (up.isEmpty()) {
            return p;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip(up.substring(1), p);
        }
        else {
            return skip(up.substring(1), p+ch);
        }
    }
}
