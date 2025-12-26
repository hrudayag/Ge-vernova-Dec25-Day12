import java.util.Scanner;
public class UserRegistration {
    public static boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Z][a-zA-Z]{2,}");
    }
    public static boolean validateLastName(String lastName) {
        return lastName.matches("[A-Z][a-zA-Z]{2,}");
    }
    public static boolean validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9]+([.][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        return email.matches(emailRegex);
    }
    public static boolean validateMobile(String mobile) {
        return mobile.matches("[0-9]{2}\\s[0-9]{10}");
    }
    public static boolean validatePasswordRule1(String password) {
        return password.length() >= 8;
    }
    public static boolean validatePasswordRule2(String password) {
        return password.matches(".*[A-Z].*");
    }
    public static boolean validatePasswordRule3(String password) {
        return password.matches(".*[0-9].*");
    }
    public static boolean validatePasswordRule4(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                count++;
            }
        }
        return count == 1;
    }
    public static void validateEmailSamples() {
        String[] emails = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com",
                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"
        };

        for (String email : emails) {
            System.out.println(email + " -> " +
                    (validateEmail(email) ? "Valid" : "Invalid"));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        System.out.println(validateFirstName(firstName) ? "Valid First Name" : "Invalid First Name");
        System.out.println(validateLastName(lastName) ? "Valid Last Name" : "Invalid Last Name");
        System.out.println(validateEmail(email) ? "Valid Email" : "Invalid Email");
        System.out.println(validateMobile(mobile) ? "Valid Mobile Number" : "Invalid Mobile Number");
        System.out.println(validatePasswordRule1(password)
                ? "Password Rule1 Passed"
                : "Password Rule1 Failed");
        System.out.println(validatePasswordRule2(password)
                ? "Password Rule2 Passed"
                : "Password Rule2 Failed");
        System.out.println(validatePasswordRule3(password)
                ? "Password Rule3 Passed"
                : "Password Rule3 Failed");
        System.out.println(validatePasswordRule4(password)
                ? "Password Rule4 Passed"
                : "Password Rule4 Failed");
        System.out.println("\nEmail Sample Validation:");
        validateEmailSamples();
        sc.close();
    }
}