import java.util.*;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> resources = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            String resourceName = input;
            int resourceQty = Integer.parseInt(scanner.nextLine());

            if (!resources.containsKey(resourceName)) {
                resources.put(resourceName, resourceQty);
            }
            else {
                Integer replace = resources.get(resourceName) + resourceQty;
                resources.replace(resourceName, replace);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
