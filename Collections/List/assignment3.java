package Collections.List;

import java.util.ArrayList;


public class assignment3 {

    public static void printAll(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        System.out.println("Printing all strings in the list:");
        printAll(stringList);
    }
}
