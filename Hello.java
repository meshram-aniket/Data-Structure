import java.util.*;

public class Hello {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8, 0};
        System.out.println(getMax(arr));

    }


    public static int getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
//        System.out.println(max);
        return max;
    }
}

