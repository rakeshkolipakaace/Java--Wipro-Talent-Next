package Collections.LamdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class assigment1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            al.add(random.nextInt(100) + 1);
        }

        System.out.println("Original List:");
        System.out.println(al);

        List<Integer> primes = al.stream()
                .filter(n -> isPrime(n))
                .collect(Collectors.toList());

        System.out.println("\nPrime Numbers in the List:");
        System.out.println(primes);
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
