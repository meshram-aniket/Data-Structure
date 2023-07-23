package HashMap;

import java.util.HashMap;

// subarray sum equal to k
public class SubarraySum {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;

        map.put(0, 1);   // because of empty map 0 exists once
        int sum = 0;
        int freq = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            }

            else  {
                map.put(sum, 1);
            }

            if (map.containsKey(sum - k)) {
                freq += map.get(sum - k);
            }
        }
        System.out.println(freq);
    }
}
