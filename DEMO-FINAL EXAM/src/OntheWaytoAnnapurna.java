import java.util.*;

public class OntheWaytoAnnapurna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> map = new HashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split("->");

            if (tokens[0].equals("Add")) {
                String store = tokens[1];
                String[] items = tokens[2].split(",");
                map.putIfAbsent(tokens[1], new ArrayList<>());
                for (int i = 0; i < items.length; i++) {
                    map.get(store).add(items[i]);
                }

            } else if (tokens[0].equals("Remove")) {
                String store = tokens[1];
                if (map.containsKey(store)) {
                    map.remove(store);
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Stores list:");
        map.entrySet().stream().sorted((a, b) -> {
            int sort = Integer.compare(b.getValue().size(), a.getValue().size());
            if (sort == 0) {
                sort = b.getKey().compareTo(a.getKey());
            }
            return sort;
        }).forEach(entry-> {
            System.out.printf("%s\n",entry.getKey());
            entry.getValue().forEach(entry2 -> System.out.printf("<<%s>>%n",entry2));
        });
    }
}
