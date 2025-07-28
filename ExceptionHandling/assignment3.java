package ExceptionHandling;

import java.util.Scanner;

class NegativeValuesException extends Exception {
    public NegativeValuesException(String message) {
        super(message);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfStudents = 2;

        for (int i = 1; i <= numberOfStudents; i++) {
            try {
                System.out.println("Enter name of Student " + i + ":");
                String name = sc.nextLine();

                int[] marks = new int[3];
                System.out.println("Enter marks for 3 subjects:");

                for (int j = 0; j < 3; j++) {
                    String input = sc.nextLine();
                    try {
                        marks[j] = Integer.parseInt(input);
                    } catch (NumberFormatException e) {
                        throw new NumberFormatException("Invalid number format for marks.");
                    }

                    if (marks[j] < 0) {
                        throw new NegativeValuesException("Negative mark entered: " + marks[j]);
                    }

                    if (marks[j] > 100) {
                        throw new OutOfRangeException("Mark out of range (0-100): " + marks[j]);
                    }
                }

                int total = marks[0] + marks[1] + marks[2];
                double average = total / 3.0;
                System.out.println("Average marks of " + name + ": " + average);

            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e.getMessage());
            } catch (NegativeValuesException e) {
                System.out.println("NegativeValuesException: " + e.getMessage());
            } catch (OutOfRangeException e) {
                System.out.println("OutOfRangeException: " + e.getMessage());
            }
        }

        sc.close();
    }

}
