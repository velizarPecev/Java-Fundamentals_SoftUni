import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,List<String>> map = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[]command = input.split(" -> ");

            if (!map.containsKey(command[0]))
            {
                map.put(command[0], new ArrayList<>());
            }if (!map.get(command[0]).contains(command[1])) {
                map.get(command[0]).add(command[1]);
            }
            input = scanner.nextLine();
        }

        for (String s : map.keySet()) {
            System.out.printf("%s\n", s);
            for (int i = 0; i < map.get(s).size(); i++) {
                System.out.printf("-- %s\n", map.get(s).get(i));
            }
        }
    }
}
