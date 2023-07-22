import LinkList.Question.Palindrome;
import Trees.BST.deleteNode;

import java.util.*;
public class practice {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("china",23 );
        map.put("india", 24);
        map.put("usa", 25);
        System.out.println(map);
        map.put("usa", 12);
        System.out.println(map);


        if (map.containsKey("usa")) {
            System.out.println("contain");
        }


        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + " = " + m.getValue());
        }

//        map.clear();
//        System.out.println(map);

        map.remove("china");
        System.out.println(map);
    }


}