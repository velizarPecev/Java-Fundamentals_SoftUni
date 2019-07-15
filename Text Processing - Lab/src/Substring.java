import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            word = word.replace(wordToRemove,"");
        }

        System.out.println(word);
    }
}
