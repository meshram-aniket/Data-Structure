import LinkList.Question.Palindrome;
import java.util.LinkedList;

public class practice {
    public static void main(String[] args) {
        int number = 1234;
        reverse(number);
    }

    static int sum = 0;
    public static void reverse(int num) {
        if (num == 0) {
            System.out.println(sum);
            return;
        }
        int remainder = num % 10;
        sum = (sum * 10) + remainder;
        reverse(num / 10);
    }
}

