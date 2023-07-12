package ArraysQuestion;

public class MinMax {
    public static void main(String[] args) {
        int[] num = {1,4,2,4,2,0,23,54,0};
        print(num);
    }

    public static void print(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0 ; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
