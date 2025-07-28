package ExceptionHandling;

public class InvalidCountryException extends Exception {

    public InvalidCountryException() {
        super("User Outside India cannot be registered");
    }

    public InvalidCountryException(String message) {
        super(message);
    }

}
