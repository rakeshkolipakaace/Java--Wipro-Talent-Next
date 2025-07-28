package Collections.List;

import java.util.Enumeration;
import java.util.Vector;
import java.util.Iterator;

public class assign7 {
    public static void main(String[] args) {
        Vector<assignment7> employees = new Vector<>();

        employees.add(new assignment7(101, "Rakesh"));
        employees.add(new assignment7(102, "Sneha"));
        employees.add(new assignment7(103, "Arjun"));

        System.out.println("Listing employees using Iterator:");
        Iterator<assignment7> it = employees.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nListing employees using Enumeration:");
        Enumeration<assignment7> e = employees.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

    }
}
