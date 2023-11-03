import java.util.regex.Pattern;

public class see {
    public static boolean validatePassword(String password) {
        
        if (password.length() < 8 || password.length() > 16) {
            return false;
        }

       
        String lowercaseRegex = ".*[a-z].*";
        String uppercaseRegex = ".*[A-Z].*";
        String digitRegex = ".*\\d.*";
        String specialCharRegex = ".*[~!@#\\$%^&*()\\-=_\\+].*";

       
        int fulfilledCategories = 0;

        if (Pattern.matches(lowercaseRegex, password)) {
            fulfilledCategories++;
        }
        if (Pattern.matches(uppercaseRegex, password)) {
            fulfilledCategories++;
        }
        if (Pattern.matches(digitRegex, password)) {
            fulfilledCategories++;
        }
        if (Pattern.matches(specialCharRegex, password)) {
            fulfilledCategories++;
        }

        
        return fulfilledCategories >= 3;
    }

    public static void main(String[] args) {
        String password = "P@ssw0rd";
        boolean isValid = validatePassword(password);

        if (isValid) {
            System.out.println("Your password works.");
        } else {
            System.out.println("Your password dose is not good .");
        }
    }
}
