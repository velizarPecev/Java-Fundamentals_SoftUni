import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("&");
        List<String> newIn = new ArrayList<>();

        for (String s : input) {
            String regex = "^([A-Za-z]*[\\d]*){16,25}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(s);

            if (matcher.find()) {
                newIn.add(matcher.group().toUpperCase());
            }
        }
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < newIn.size(); i++) {
            String s = newIn.get(i);
            if (s.length() == 16) {
                for (int j = 0; j < s.length(); j += 4) {
                    for (int k = j; k < j + 4; k++) {
                        newString.append(s.charAt(k));
                    }
                    if (j < s.length() - 4) {
                        newString.append("-");
                    }
                }
            } else if (s.length() == 25) {
                for (int j = 0; j < s.length(); j += 5) {
                    for (int k = j; k < j + 5; k++) {
                        newString.append(s.charAt(k));
                    }
                    if (j < s.length() - 5) {
                        newString.append("-");
                    }
                }
            }
            if (i < newIn.size() - 1)
                newString.append(", ");
        }

        StringBuilder end = new StringBuilder();
        for (int i = 0; i < newString.length(); i++) {
            char symbol = newString.charAt(i);
            if (Character.isDigit(symbol)) {
                int digit = Math.abs(Integer.parseInt(String.valueOf(symbol)) - 9);
                end.append(digit);
            } else {
                end.append(symbol);
            }
        }
        System.out.println(end);
    }
}
