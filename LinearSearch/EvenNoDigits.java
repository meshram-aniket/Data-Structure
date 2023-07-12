package LinearSearch;

public class EvenNoDigits {
    public static void main(String[] args) {
        int[] arr = {23,2,43,545,34,5455,342};
        System.out.println(isEven(arr));
    }

    static int isEven(int[] arr) {
        int even = 0;
        int count = 0;
        for (int ar: arr) {
            count = (int) (Math.log10(ar))+1;

            if (count%2==0) {
                even++;
            }
        }
        return even;
    }
}
