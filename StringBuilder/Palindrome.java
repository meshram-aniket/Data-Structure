package StringBuilder;

public class Palindrome {
    public static void main(String[] args) {
        char[] ch = {'a','b','c','a','c','b','a'};
        System.out.println(isPalindrome(ch));
    }

    public static boolean isPalindrome(char[] ch) {
        int start = 0;
        int end = ch.length-1;
        while (start <= end) {
            if (ch[start] == ch[end]) {
                start++;
                end--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
