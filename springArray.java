public class springArray {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,32,34,34,47,50,52,93,904};
        int ans = search(arr, 40);
        System.out.println(ans);

//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        search(arr);

    }

    public static int search(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;


        boolean isAscending;
        if (arr[start] < arr[end]) {
            isAscending = true;
        }
        else {
            isAscending = false;
        }
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return arr[mid];
                }
            }

            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return arr[mid];
                }
            }
        }
        return arr[end-1];



//        int rowStr = 0;
//        int rowEnd = arr.length-1;
//
//        int colStr = 0;
//        int colEnd = arr.length-1;
//
//
//        while (rowStr <= rowEnd && colStr <= colEnd) {
//            for (int col = colStr; col <= colEnd; col++ ) {
//                System.out.print(arr[rowStr][col]);
//            }
//            rowStr++;
//
//            for (int row = rowStr; row <= rowEnd; row++) {
//                System.out.print(arr[row][colEnd]);
//            }
//            colEnd--;
//
//            for (int col = colEnd; col >= colStr; col--) {
//                System.out.print(arr[rowEnd][col]);
//            }
//            rowEnd--;
//
//            for (int row = rowEnd; row >= rowStr ; row--) {
//                System.out.print(arr[row][colStr]);
//            }
//            colStr++;
//        }
    }
}
