package BinarySearchQuestion;

//Q: Search In duplicate Rotated Array
public class SearchInDuplicateRotatedArray {
    public static void main(String[] args) {
        int[] nums = {2,2,3,3,4,0,0,1};
        int target = 3;
        System.out.println(search(nums, target));
    }


    static int search(int[] nums, int target) {
        int pivot = findPivotInDuplicate(nums);


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

    public static int findPivotInDuplicate(int[] nums) {
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

            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
//                check if start is pivot
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                //check whether end is pivot
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }

//                left side is sorted, so pivot should be in right
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end]) ){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

