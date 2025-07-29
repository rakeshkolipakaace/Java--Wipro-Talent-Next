package Collections.Sets;

import java.util.HashSet;
import java.util.Iterator;

public class assignment2 {
    public static void main(String[] args) {
        HashSet<String> employeeNames = new HashSet<>();

        employeeNames.add("Roy");
        employeeNames.add("John");
        employeeNames.add("Jane");
        employeeNames.add("Alex");

        Iterator<String> iterator = employeeNames.iterator();
        System.out.println("Employee names:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
