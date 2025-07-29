package Collections.Methods;

@FunctionalInterface
interface PrimeChecker {
    void check(int n);
}

class PrimeNumber {
    public PrimeNumber(int n) {
        if (isPrime(n)) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }

    private boolean isPrime(int n) {
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

public class assignment3 {
    public static void main(String[] args) {

        PrimeChecker checker = PrimeNumber::new;

        int number = 17;
        checker.check(number);
    }
}
