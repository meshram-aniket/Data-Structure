package FunctionMethod;

public class Greet {
    public static void main(String[] args) {
        String answer = Greeting();
        System.out.println(answer);
    }
    static String Greeting() {
        String ans = "hey, how are you ?";
        return ans;
    }
}
