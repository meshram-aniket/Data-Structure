package HashMap;

import java.util.HashMap;



// given an integer array of size n, find all elements that appear more than (n/3) times
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        MajorityElement e = new MajorityElement();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            e.majority(map, arr[i]);
        }
        System.out.println(map);
        e.countTime(map, arr.length);

    }


    public void majority(HashMap<Integer, Integer> map, int element) {
        int count = 1;
        if (map.containsKey(element)) {
            map.put(element, map.get(element) + 1);
        }
        else {
            map.put(element, 1);
        }
    }


    public void countTime(HashMap<Integer, Integer> map, int n) {
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println(key);
            }
        }
    }
}
