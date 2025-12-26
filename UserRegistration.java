import java.util.Scanner;
public class UserRegistration {
    static class UserRegistrationException extends Exception {
        public UserRegistrationException(String message) {
            super(message);
        }
    }
    //skipping j unit test as mentioned in class
    public static void validateFirstName(String firstName) throws UserRegistrationException {
        if (!firstName.matches("[A-Z][a-zA-Z]{2,}")) {
            throw new UserRegistrationException("Invalid First Name");
        }
    }
    public static void validateLastName(String lastName) throws UserRegistrationException {
        if (!lastName.matches("[A-Z][a-zA-Z]{2,}")) {
            throw new UserRegistrationException("Invalid Last Name");
        }
    }

    public static boolean validateEmail(String email) {
        String emailRegex =
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@" +
                        "[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})$";
        return email.matches(emailRegex);
    }


    public static void validateMobile(String mobile) throws UserRegistrationException {
        if (!mobile.matches("[0-9]{2}\\s[0-9]{10}")) {
            throw new UserRegistrationException("Invalid Mobile Number");
        }
    }

    public static void validatePassword(String password) throws UserRegistrationException {

        if (password.length() < 8) {
            throw new UserRegistrationException("Password must have minimum 8 characters");
        }

        if (!password.matches(".*[A-Z].*")) {
            throw new UserRegistrationException("Password must contain at least one Uppercase letter");
        }

        if (!password.matches(".*[0-9].*")) {
            throw new UserRegistrationException("Password must contain at least one Digit");
        }

        int specialCharCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                specialCharCount++;
            }
        }

        if (specialCharCount != 1) {
            throw new UserRegistrationException("Password must contain exactly one Special Character");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter First Name: ");
            String firstName = sc.nextLine();
            validateFirstName(firstName);

            System.out.print("Enter Last Name: ");
            String lastName = sc.nextLine();
            validateLastName(lastName);

            System.out.print("Enter Email: ");
            String email = sc.nextLine();
            validateEmail(email);

            System.out.print("Enter Mobile Number: ");
            String mobile = sc.nextLine();
            validateMobile(mobile);

            System.out.print("Enter Password: ");
            String password = sc.nextLine();
            validatePassword(password);

            System.out.println("\nAll User Details are VALID");

        } catch (UserRegistrationException e) {
            System.out.println("\nValidation Error: " + e.getMessage());
        }
        sc.close();
    }
}