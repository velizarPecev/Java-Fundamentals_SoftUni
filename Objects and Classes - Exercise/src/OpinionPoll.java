import java.util.*;
import java.util.stream.Collectors;

public class  OpinionPoll {
    private String firstName;
    private int age;

    public OpinionPoll(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getName() {

        return firstName;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<OpinionPoll> personList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] persons = scanner.nextLine().split(" ");
            String firstName = persons[0];
            int age = Integer.parseInt(persons[1]);

            OpinionPoll person = new OpinionPoll(firstName, age);
            if (person.age > 30) {
                personList.add(person);
            }
        }

        List<OpinionPoll> sortedList = personList.stream()
                .sorted(Comparator.comparing(OpinionPoll::getName))
                .collect(Collectors.toList());

        for (OpinionPoll p : sortedList) {
            System.out.printf("%s - %d%n", p.firstName, p.age);
        }
    }
}
