import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] wordsToRemove = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : wordsToRemove) {
            if (text.contains(banWord)) {
                String replacement = repeat("*", 	banWord.length());
                text = text.replace(banWord, replacement);
            }
        }
        System.out.println(text);

    }
    static String repeat (String word, int lenght){
        String replacement = "";
        for (int i = 0; i < lenght; i++) {
            replacement += word;
        }
        return replacement;
    }
}
