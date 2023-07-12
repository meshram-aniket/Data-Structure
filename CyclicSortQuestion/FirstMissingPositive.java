package CyclicSortQuestion;

//Q: first positive number
import java.util.Arrays;
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {2,3,6,4,5};
        System.out.println(firstMissingPositive(nums));

    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;

            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                return index +1;
            }
        }
        return nums.length+1;
    }

    public static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
