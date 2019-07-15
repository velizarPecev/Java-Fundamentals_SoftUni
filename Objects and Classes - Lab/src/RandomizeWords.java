import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {

    public class RandomWords {
        String random;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {

            int firstWord = rnd.nextInt(words.length);
            int secondWord = rnd.nextInt(words.length);

            String changer = words[firstWord];
            words[firstWord] = words[secondWord];
            words[secondWord] = changer;
        }

        System.out.println(String.join(

                System.lineSeparator(), words));
    }
}
