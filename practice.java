import LinkList.Question.Palindrome;
import java.util.LinkedList;

public class practice {
    public static void main(String[] args) {
        int number = 1234;
        System.out.println(reverse(number));;
    }

    static int sum = 0;
    public static int reverse(int num) {
        if (num == 0) {
//            System.out.println(sum);
            return 0;
        }
        int remainder = num % 10;
        sum = (sum * 10) + remainder;
        reverse(num / 10);
        return sum;
    }
}

