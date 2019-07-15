import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<String>> word = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String words = scanner.nextLine();
            String synonym = scanner.nextLine();

            word.putIfAbsent(words,new ArrayList<>());
            word.get(words).add(synonym);
        }

        for (Map.Entry<String,ArrayList<String>> entry:word.entrySet()) {
            System.out.print(entry.getKey()+" - ");
            List<String> synonyms = entry.getValue();
            System.out.println(String.join(", ",synonyms));
        }
    }
}
