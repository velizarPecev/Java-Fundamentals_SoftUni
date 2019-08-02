import java.io.Console;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnimalSanctuary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("^n:(?<animalname>[^;]+);t:(?<animalkind>[^;]+);c--(?<animalcountry>[A-Za-z\\s]+)$");
        int weight = 0;
        for (int i = 0; i < n; i++) {
            String lines = scanner.nextLine();
            Matcher matcher = pattern.matcher(lines);

            while (matcher.find()) {
                String name = matcher.group(1);
                String animalKind = matcher.group(2);
                String country = matcher.group(3);

                String resultName = "";
                for (int j = 0; j < name.length(); j++) {
                    char c = name.charAt(j);
                    if (Character.isLetter(c) || c == ' ') {
                        resultName += c;
                    }

                    if (Character.isDigit(c)) {
                        weight += Character.getNumericValue(c);
                    }
                }

                String resultKind = "";
                for (int j = 0; j < animalKind.length(); j++) {
                    char c = animalKind.charAt(j);
                    if (Character.isAlphabetic(c) || c == ' ') {
                        resultKind += c;
                    }

                    if (Character.isDigit(c)) {
                        weight += Character.getNumericValue(c);
                    }
                }
                System.out.printf("%s is a %s from %s%n", resultName, resultKind, country);
            }
        }
        System.out.printf("Total weight of animals: %dKG%n", weight);
    }
}

