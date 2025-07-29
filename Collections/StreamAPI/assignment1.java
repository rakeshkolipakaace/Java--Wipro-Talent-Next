package Collections.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class assignment1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, -2, -3, 4, -8, 7, -6, 9, 0, -1);

        List<Integer> negativeEvens = numbers.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Negative even numbers: " + negativeEvens);
    }
}
