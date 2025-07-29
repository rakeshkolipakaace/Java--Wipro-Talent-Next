package Collections.Methods;

public class MainApp {
    public static void main(String[] args) {
        factor calc = new factor();

        factorial func = calc::factorial;

        int number = 5;
        int result = func.compute(number);

        System.out.println("Factorial of " + number + " is: " + result);
    }
}
