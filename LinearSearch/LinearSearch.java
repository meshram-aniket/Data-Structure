package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {1,24,4,6,6,4,6,854,55,45};
        System.out.println(linearSearch(arr, 4));
    }
    public static int linearSearch(int[] arr, int target) {
        if (arr.length==0){
            return -1;
        }
        for (int i=0; i<arr.length; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }
}
