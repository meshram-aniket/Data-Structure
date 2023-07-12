package CyclicSortQuestion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Q: Find All Duplicates in an Array
public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1){
                list.add(nums[index]);
                Collections.sort(list);
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
