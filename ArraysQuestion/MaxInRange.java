package ArraysQuestion;

public class MaxInRange {
    public static void main(String[] args) {
        int[] a = {1,4,2,66,33,76};
        System.out.println(max(a,2, 5));
    }

    public static int max(int[] a, int start, int end){

        int maxVal = a[start];
        for (int i = start; i <= end; i++){
            if (maxVal < a[i]) {
                maxVal = a[i];
            }
        }
        return maxVal;
    }
}
