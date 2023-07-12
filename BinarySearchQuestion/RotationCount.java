package BinarySearchQuestion;

public class RotationCount{
    public static void main(String[] args) {
        int[] nums = {3,4,5,0,1,2};
        System.out.println(count(nums));
    }

    public static int count(int[] nums) {
        int pivot = findPivot(nums);
        return pivot + 1;


    }

//    use this if non duplicate
    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

//            4 cases to find pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }


        }
        return -1;
    }

//    use this if duplicate
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
