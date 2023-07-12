package Recursion;

public class skipString {
    public static void main(String[] args) {
        String str = "agnfapplekdskngn";
        System.out.println(skipApple(str));
    }

    public static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);
//        if (up.startsWith("app")) {
//            return skipApple(up.substring(5));
//        }
//        else {
//            return ch + skipApple(up.substring(1));
//        }


        // skipped app but bot from apple
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipApple(up.substring(5));
        }
        else {
            return ch + skipApple(up.substring(1));
        }
    }
}
