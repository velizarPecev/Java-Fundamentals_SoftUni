import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> map = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");

            if (command[0].equals("register")){
                if (!map.containsKey(command[1])){
                    map.put(command[1],command[2]);
                    System.out.printf("%s registered %s successfully%n",command[1],command[2]);
                }else{
                    System.out.println("ERROR: already registered with plate number "+command[2]);
                }
            }else if (command[0].equals("unregister")){
                if (!map.containsKey(command[1])){
                    System.out.printf("ERROR: user %s not found%n",command[1]);
                }else{
                    System.out.printf("%s unregistered successfully%n",command[1]);
                    map.remove(command[1]);
                }
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("%s => %s%n",entry.getKey(),entry.getValue());
        }

    }
}
