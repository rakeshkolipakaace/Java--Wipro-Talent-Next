package Collections.Methods;

@FunctionalInterface
interface DigitFunction {
    int compute(int n);
}

class DigitUtility {
    public static int digitCount(int n) {
        n = Math.abs(n);

        if (n == 0)
            return 1;

        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}

public class assignment2 {
    public static void main(String[] args) {

        DigitFunction func = DigitUtility::digitCount;

        int number = 12345;
        int result = func.compute(number);

        System.out.println("Number of digits in " + number + " is: " + result);
    }
}
