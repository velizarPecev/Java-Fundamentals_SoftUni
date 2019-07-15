import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }
            String[] tokens = line.split(" ");

            switch (tokens[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    nums.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(tokens[1]);
                    nums.removeIf(n->n==numberToRemove);
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    nums.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    int indexToInsert = Integer.parseInt(tokens[2]);
                    nums.add(indexToInsert, numberToInsert);
                    break;
            }
        }
        System.out.println(nums.toString().replaceAll("[\\[\\],]", ""));
    }
}
