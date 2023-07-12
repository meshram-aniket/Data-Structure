package CyclicSortQuestion;

//Q: Set MisMatch
import java.util.Arrays;
public class Set_Mismatch {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] -1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                return new int[] {nums[index], index+1};
            }
        }
        return new int[] {-1,-1};
    }

    public static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
