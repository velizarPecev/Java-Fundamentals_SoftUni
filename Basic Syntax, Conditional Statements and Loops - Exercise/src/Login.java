import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String password = "";
        for (int i = username.length()-1; i >= 0 ; i--) {
            password +=(username.charAt(i));
        }

        String entry = scanner.nextLine();
        int counter = 1;

        while (!entry.equals(password)){
            if (counter >= 4){
                break;
            }
            System.out.println("Incorrect password. Try again.");
            entry = scanner.nextLine();
            counter++;
        }

        if (entry.equals(password)) {
            System.out.printf("User %s logged in.",username);
        }else {
            System.out.printf("User %s blocked!",username);
        }
    }
}
