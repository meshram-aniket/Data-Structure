package BinarySearchQuestion;

//Q: position of element an element in an infinite array
public class PositionOfElement {
    public static void main(String[] args) {
        int[] arr = {4,13,15,116,123,200};
        System.out.print(ans(arr,15));

    }

    public static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        if (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;

        }
        return Search(arr, target, start, end);
    }

    public static int Search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
