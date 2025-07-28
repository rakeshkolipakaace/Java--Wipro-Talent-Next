package Collections.List;

import java.util.ArrayList;

public class assignment4
{
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10);        
        numbers.add(15.5f);      
        numbers.add(20.75);     
        numbers.add(100L);      

        System.out.println("Stored Numbers:");
        for (Number num : numbers) {
            System.out.println(num);
        }
    }
}
