package Collections.Sets;

import java.util.Iterator;
import java.util.TreeSet;

public class assignment3 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Java");
        ts.add("c++");
        ts.add("c");
        ts.add("Python");

        TreeSet<String> reversedTreeSet = new TreeSet<>(ts.descendingSet());

        System.out.println("Reversed elements:");
        for (String element : reversedTreeSet) {
            System.out.println(element);
        }

        System.out.println("\nIterating elements using Iterator:");
        Iterator<String> iterator = ts.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        String searchElement = "JavaScript";
        if (ts.contains(searchElement)) {
            System.out.println("\n'" + searchElement + "' exists in the TreeSet.");
        } else {
            System.out.println("\n'" + searchElement + "' does not exist in the TreeSet.");
        }
    }

}
