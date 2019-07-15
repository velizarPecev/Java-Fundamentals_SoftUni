import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsinaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String chars = scanner.nextLine();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char symbol: chars.toCharArray()) {
            if (symbol != ' ') {
                if (!map.containsKey(symbol)) {
                    map.put(symbol, 1);
                } else {
                    int currCount = map.get(symbol);
                    map.put(symbol, currCount+1);
                }
            }
        }
        for (Map.Entry<Character, Integer> wrd : map.entrySet()) {
            System.out.printf("%s -> %d%n", wrd.getKey(), wrd.getValue());
        }
    }
}
