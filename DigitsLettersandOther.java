import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitsLettersandOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digit = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                digit.append(ch);
            } else if (Character.isLetter(ch)) {
                letters.append(ch);
            } else {
                other.append(ch);
            }
        }
        System.out.println(digit);
        System.out.println(letters);
        System.out.println(other);
    }
}
