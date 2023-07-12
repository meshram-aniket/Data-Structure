package BinarySearchQuestion;

public class solution {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(search(arr, 2 ));
    }

    public static int search(int[] arr, int m) {
        int start = 0 ;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(0, arr.length-1);
            end += arr[i];
        }

        while(start < end) {
            int mid = start + (end - start)/2;
            int peice =1;
            int sum = 0;
            for (int num: arr) {
                if (num + sum > mid) {
                    sum = num;
                    peice++;
                }
                else {
                    sum += num;

                }
            }

            if (peice > m) {
                start = mid + 1;

            }

            else {
                end = mid;
            }
        }
        return end;
    }
}
