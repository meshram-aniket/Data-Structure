package ArraysQuestion;
import java.util.Collections;
import java.util.Collection;

public class MaxNum {
    public static void main(String[] args) {
        System.out.println(max());
    }
    public static int max() {
        int[] arr = {1, 2, 76, 2, 76, 3, 5};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}
