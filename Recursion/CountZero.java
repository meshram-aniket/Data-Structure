package Recursion;

public class CountZero {
    public static void main(String[] args) {
        int num = 400305320;
        System.out.println(countNum(num));
    }

    static int count = 0;
    public static int countNum(int num) {
        if (num == 0) {
            return count;
        }
        if (num % 10 == 0) {
            count+=1;
        }
        return countNum(num / 10);
    }
}
