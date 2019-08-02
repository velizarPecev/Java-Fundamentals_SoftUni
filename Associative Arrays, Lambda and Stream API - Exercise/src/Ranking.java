import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> map1 = new LinkedHashMap<>();
        Map<String, String> map2 = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end of contests")){
            String[] tokens = input.split(":");
            map1.put(tokens[0],tokens[1]);
            input=scanner.nextLine();
        }

        String command = scanner.nextLine();

        while (!command.equals("end of submissions")){
            String[] tokens = command.split("=>");
            map2.put(tokens[0],tokens[1]);
            if (!map1.containsKey(tokens[0])){
                map2.remove(tokens[0]);
            }
            command=scanner.nextLine();
        }
        System.out.println();
    }
}
