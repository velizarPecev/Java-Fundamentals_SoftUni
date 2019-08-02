import java.util.*;

public class PracticeSessions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> map = new TreeMap<>();
        String input = scanner.nextLine();

        while (!input.equals("END")){
            String[] tokens = input.split("->");
            String command = tokens[0];

            if (command.equals("Add")){
                if (!map.containsKey(tokens[1])){
                    map.put(tokens[1],new ArrayList<>());
                    for (int i = 2; i < tokens.length; i++) {
                        map.get(tokens[1]).add(tokens[i]);
                    }
                }else{
                    for (int i = 2; i < tokens.length; i++) {
                        map.get(tokens[1]).add(tokens[i]);
                    }
                }
            }else if (command.equals("Move")){
                String oldRoad = tokens[1];
                String racer = tokens[2];
                String newRoad = tokens[3];

                if(map.get(oldRoad).contains(racer)){
                    map.get(oldRoad).remove(racer);
                    map.get(newRoad).add(racer);
                }
            }else if (command.equals("Close")){
                if (map.containsKey(tokens[1])){
                    map.remove(tokens[1]);
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Practice sessions:");
        map.entrySet().stream().sorted((f,s)->{
                    if (s.getValue().size() - f.getValue().size() == 0) {
                        return f.getKey().compareTo(s.getKey());
                    } else {
                        return s.getValue().size() - f.getValue().size();
                    }
                }).forEach(entry->{
            System.out.printf("%s\n",entry.getKey());
            entry.getValue().forEach(entry1 ->{
                System.out.printf("++%s\n",entry1);
            });
        });
    }
}
