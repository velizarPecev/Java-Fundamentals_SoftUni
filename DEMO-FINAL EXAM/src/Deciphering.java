import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deciphering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] substringArr = scanner.nextLine().split("\\s+");

        for (int i = 0; i < input.length(); i++) {
            int letter = input.charAt(i);
            if(letter != 35) {
                if (letter < 100 || letter > 125) {
                    System.out.println("This is not the book you are looking for.");
                    return;
                }
            }
        }

        String word = "";
        for (int i = 0; i < input.length(); i++) {
            int letter = input.charAt(i);
            int letterF = letter - 3;
            word += (char)letterF;
        }

        word = word.replace(substringArr[0], substringArr[1]);
        System.out.println(word);

    }
}
