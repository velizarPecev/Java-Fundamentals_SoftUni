import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VaporWinterSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> gamesPrice = new LinkedHashMap<>();
        Map<String, String> gamesWithDLC = new LinkedHashMap<>();

        String[] game = scanner.nextLine().split(", ");

        for (String command : game) {
            if (command.contains("-")){
                String[] data = command.split("-");

                String gameName = data[0];
                double price = Double.parseDouble(data[1]);

                gamesPrice.put(gameName, price);
            }else if (command.contains(":")) {
                String[] data = command.split(":");

                String gameName = data[0];
                String DLC = data[1];

                if (gamesPrice.containsKey(gameName)) {
                    gamesWithDLC.put(gameName, DLC);
                    gamesPrice.put(gameName, gamesPrice.get(gameName) * 1.2);
                }
            }
        }
        for (Map.Entry<String, Double> kvp : gamesPrice.entrySet()) {
            if (gamesWithDLC.containsKey(kvp.getKey())) {
                gamesPrice.put(kvp.getKey(), kvp.getValue() * 0.5);
            } else {
                gamesPrice.put(kvp.getKey(), kvp.getValue() * 0.8);
            }
        }

        gamesPrice.entrySet().stream()
                .sorted((p1, p2) -> Double.compare(p1.getValue(), p2.getValue()))
                .forEach(e -> {
                    if (gamesWithDLC.containsKey(e.getKey())) {
                        System.out.println(String.format("%s - %s - %.2f", e.getKey(), gamesWithDLC.get(e.getKey()), e.getValue()));
                    }
                });
        gamesPrice.entrySet().stream()
                .sorted((p1, p2) -> Double.compare(p2.getValue(), p1.getValue()))
                .forEach(e -> {
                    if (!gamesWithDLC.containsKey(e.getKey())) {
                        System.out.println(String.format("%s - %.2f", e.getKey(), e.getValue()));
                    }
                });
    }
}
