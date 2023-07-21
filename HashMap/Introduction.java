//package HashMap;
//
//import java.util.HashMap;
//
//public class Introduction {
//    public static void main(String[] args) {
//        HashMap<String, Integer>  map = new HashMap<>();
//
//        // insertion
//        map.put("India", 120);
//        map.put("China", 30);
//        map.put("US", 10);
//        System.out.println(map);
//
//        // two cases it key is available then value is updated
//        // else crete a new value
//        map.put("China", 180);
//        System.out.println(map);
//
//
//
//        // search
//        if (map.containsKey("China")) {
//            System.out.println("present");
//        }
//        else {
//            System.out.println("not present in map");
//        }
//
//
//
//        // get function
//        System.out.println(map.get("China"));  // key exist
//        System.out.println(map.get("Malaysia")); // key does not exist
//
//
//
//        //
//        int[] arr = {11, 12, 13, 14, 15, 16};
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//
//        for (int val: arr) {
//            System.out.print(val + " ");
//        }
//
//    }
//}
//
