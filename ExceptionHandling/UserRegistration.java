package ExceptionHandling;

public class UserRegistration {
    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException();
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        UserRegistration reg = new UserRegistration();

        try {
            reg.registerUser("Mickey", "US");
        } catch (InvalidCountryException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            reg.registerUser("Mini", "India");
        } catch (InvalidCountryException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
