package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-4,5,7,8};
        System.out.println( search(arr, 1, 2, 5));
    }

    public static int search(int[] arr, int target, int start, int end){

        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i<=end; i++) {
            if (target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
