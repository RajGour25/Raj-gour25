class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionDemo {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above!");
        } else {
            System.out.println("Access Granted");
        }
    }

    public static void main(String[] args) {

        // User-defined exception
        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("User Defined Exception: " + e.getMessage());
        }

        // Array exception
        try {
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception: " + e);
        }

        System.out.println("Program continues...");
    }
}