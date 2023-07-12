package Recursion;
import java.util.ArrayList;
public class Dice {
    public static void main(String[] args) {
        System.out.println(dice(4, ""));
    }

    public static ArrayList<String> dice(int target, String p) {
        if (target == 0) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target ; i++) {
            list.addAll(dice(target-i, p+i));
        }
        return list;
    }
}
