import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String,Double> map = new LinkedHashMap<>();
        LinkedHashMap<String, Double> orders = new LinkedHashMap<>();

        while (!input.equals("buy")){
            String [] tokens = input.split(" ");

            String produckt = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            double quantities = Double.parseDouble(tokens[2]);

            if (!map.containsKey(produckt)){
                orders.put(produckt,quantities*price);
                map.put(produckt,quantities);
            }
            else {
                map.put(produckt, map.get(produckt) + quantities);
                orders.put(produckt, map.get(produckt) * price);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue());
        }

    }
}
