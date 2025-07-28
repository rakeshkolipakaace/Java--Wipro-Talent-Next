package ExceptionHandling;

public class PersonValidator {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("Usage: java PersonValidator <name> <age>");
                return;
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new ageexecption("Age must be between 18 and 59.");
            }

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Registration successful!");

        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be a valid integer.");
        } catch (ageexecption e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}
