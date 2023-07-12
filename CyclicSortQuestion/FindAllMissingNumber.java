package CyclicSortQuestion;
import java.util.ArrayList;
import java.util.List;

//Q: find all number disappered in an array
public class FindAllMissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(findDisappearedNumbers(nums));

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;
            if ( nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                list.add(index+1);
            }
        }
        return list;
    }

    public static void swap (int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
