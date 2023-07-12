package StringBuilder;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("aniket");
        reverse(name);

    }

    public static void reverse(StringBuilder name) {

        for (int i = 0; i < name.length()/2; i++) {
            int front = i;
            int back = name.length()-1-i;

            char frontchar = name.charAt(front);
            char backchar = name.charAt(back);

            name.setCharAt(front, backchar);
            name.setCharAt(back, frontchar);

        }
        System.out.println(name);
    }
}
