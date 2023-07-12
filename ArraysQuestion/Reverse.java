package ArraysQuestion;

import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        int[] aa = {1, 2, 3, 4, 5};
        reverse(aa);
    }

    public static void reverse(int[] b) {
        int start = 0;
        int end = b.length-1;
        while (start < end) {
            int temp = b[start];
            b[start]=b[end];
            b[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(b));
    }
}
