package BinarySearchQuestion;


//  Q: Search in Rotated Sorted Array
public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,9,10,0,1,2};
        int target = 10;
        System.out.println(search(nums, target));
    }


    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);


        //  if pivot is not found the do the normal binary search
        if (pivot == -1) {
           return binarySearch(nums, target, 0 , nums.length);
        }

        if (nums[pivot] == target){
            return pivot;
        }

        if (target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }

        return binarySearch(nums, target, pivot+1, nums.length);
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end-start) / 2;

//            4 cases to find pivot
            if (mid < end && nums[mid] > nums[mid+1]) {
                return mid;
            }

            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[mid] <= nums[start]) {
                end =  mid - 1;
            }
            else {
                start = mid + 1;
            }


        }
        return -1;
    }
}
