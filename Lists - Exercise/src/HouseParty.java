import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> people = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0){
            String command = scanner.nextLine();
            String[] tokens = command.split(" ");

            String name = tokens[0];

            if (command.contains("is going!")){
                if (people.contains(name)){
                    System.out.println(name + " is already in the list!");
                }else {
                    people.add(name);
                }
            }else{
                if (!people.remove(name)){
                    System.out.println(name+" is not in the list!");
                }
            }
        }

        for (String person:people) {
            System.out.println(person);
        }
    }
}
