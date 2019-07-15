import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String numberInString = "" + number;
        printResult(numberInString, scanner);
    }

    static void printResult(String numberInString, Scanner scanner) {
        while (!"END".equals(numberInString)) {

            String reversed = "";
            for (int i = numberInString.length() - 1; i >= 0; i--) {
                reversed += (char) numberInString.charAt(i) + "";
            }

            if (reversed.equals(numberInString)) {
                System.out.println("true");
            } else {
                System.out.println(false);
            }

            numberInString = scanner.nextLine();
        }
    }
}
