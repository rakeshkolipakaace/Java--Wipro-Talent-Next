package Collections.LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class assignment2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("apple");
        al.add("banana");
        al.add("cat");
        al.add("dog");
        al.add("elephant");
        al.add("fish");
        al.add("grape");
        al.add("hat");
        al.add("ice");
        al.add("jungle");

        Collections.reverse(al);

        System.out.println("Words in reverse order:");
        al.forEach(word -> System.out.println(word));

        HashMap<String, String> map = new HashMap<>();
        map.put("fruit", "apple");
        map.put("animal", "dog");

        assignment2 obj = new assignment2();
        System.out.println("Key 'fruit' exists: " + obj.keyExists(map, "fruit"));
        System.out.println("Key 'vehicle' exists: " + obj.keyExists(map, "vehicle"));
    }

    public boolean keyExists(HashMap<String, String> map, String key) {
        return map.containsKey(key);
    }
}
