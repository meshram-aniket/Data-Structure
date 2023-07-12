package LinearSearch;

public class Max_Min {
    public static void main(String[] args) {
        int[] arr = {343,4,4,33,7,55,34,76};
        search(arr);
    }
    public static void search(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]) {
                max = arr[i];
            }
            if (min>arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("max no is: "+max);
        System.out.print("min no is: "+min);

    }
}
