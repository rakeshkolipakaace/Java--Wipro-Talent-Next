package Collections.LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;

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
    }

}
