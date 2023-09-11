import LinkList.Question.Palindrome;
import java.util.LinkedList;

public class practice {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,12,43,50,60,100,120,130};
        System.out.println(linearSearch(arr, 50));
    }



    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }


}

