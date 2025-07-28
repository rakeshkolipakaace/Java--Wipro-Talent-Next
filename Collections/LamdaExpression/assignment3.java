package Collections.LamdaExpression;

import java.util.ArrayList;

public class assignment3 {
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

        System.out.println("Words with odd length:");

        al.stream()
                .filter(word -> word.length() % 2 != 0)
                .forEach(word -> System.out.println(word));
    }

}
