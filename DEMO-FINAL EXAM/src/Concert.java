import java.util.*;

public class Concert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> add = new LinkedHashMap<>();
        Map<String, Integer> play = new HashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("start of concert")) {

            String[] tokens = command.split("; ");
            String namesSplit = tokens[2];
            String[] names = namesSplit.split(", ");

            if (tokens[0].equals("Add")) {
                if (!add.containsKey(tokens[1])) {
                    add.put(tokens[1], new ArrayList<>());
                }

                for (int i = 0; i < names.length; i++) {
                    if (!add.get(tokens[1]).contains(names[i])) {
                        add.get(tokens[1]).add(names[i]);
                    }
                }
            } else if (tokens[0].equals("Play")) {
                if (!play.containsKey(tokens[1])) {
                    play.put(tokens[1], Integer.parseInt(tokens[2]));
                } else {
                    int lastValue = play.get(tokens[1]);
                    play.replace(tokens[1], lastValue + Integer.parseInt(tokens[2]));
                }
            }

            command = scanner.nextLine();
        }
        int totalTime = 0;
        for (Map.Entry<String, Integer> stringIntegerEntry : play.entrySet()) {
            totalTime += stringIntegerEntry.getValue();
        }
        System.out.println("Total time: " + totalTime);

        play.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .forEach(entry -> {
                    System.out.println(entry.getKey() + " -> " + entry.getValue());
                });

        String timeWin = scanner.nextLine();
        System.out.println(timeWin);

      add.get(timeWin).forEach(entry ->{
          System.out.println("=> "+entry);
      });


    }
}
