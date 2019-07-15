import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();

        if (validatePass(pass)) {
            System.out.println("Password is valid");
        }

    }

    static boolean validatePass(String pass) {
        boolean isValid = true;
        if (!checkLength(pass)) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }
        if (!containsOnlyLattersAndDigits(pass)){
            System.out.println("Password must consist only of letters and digits");
            isValid = false;
        }
        if (!hasAtLeastTwoDigits(pass)){
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }
        return isValid;
    }

   static boolean hasAtLeastTwoDigits (String pass) {
        int count = 0;

       for (int i = 0; i < pass.length(); i++) {
           if (Character.isDigit(pass.charAt(i))){
               count++;

               if (count == 2){
                   return true;
               }
           }
       }
       return false;
   }

    static boolean containsOnlyLattersAndDigits(String pass) {
        boolean isValid = true;

        for (int i = 0; i < pass.length(); i++) {
            if (!Character.isLetterOrDigit(pass.charAt(i))) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    static boolean checkLength(String pass) {
        boolean isValid = false;
        if (pass.length() >= 6 && pass.length() <= 10) {
            isValid = true;
        }
        return isValid;
    }
}
