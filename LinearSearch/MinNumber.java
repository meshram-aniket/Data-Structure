package LinearSearch;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {4,6,4,6,78,86,4,43,5,54};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {

        int min = arr[0];
        for (int i = 0 ; i < arr.length; i++) {
            if (min>arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
