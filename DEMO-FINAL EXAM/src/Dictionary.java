import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> listMap = new TreeMap<>();
        String[] input = scanner.nextLine().split("\\s+\\|\\s+");

        for (String word:input) {
            String[] definitions = word.split("\\s*:\\s*");
            listMap.putIfAbsent(definitions[0],new ArrayList<>());
            for (int i = 1; i < definitions.length; i++) {
                listMap.get(definitions[0]).add(definitions[i]);
            }
        }
        String[] print = scanner.nextLine().split("\\s*\\|\\s*");

        for (String printWordDef : print) {
            if (listMap.containsKey(printWordDef)) {
                System.out.println(printWordDef);
                listMap.get(printWordDef).stream().sorted(((e1, e2) ->
                        Integer.compare(e2.length(), e1.length())))
                        .forEach(e -> System.out.println(String.format("-%s", e)));
            }
        }
        String output = scanner.nextLine();
        if("List".equals(output)) {
            listMap.forEach((key, value) -> System.out.print(String.format("%s ", key)));

        }
    }
}
