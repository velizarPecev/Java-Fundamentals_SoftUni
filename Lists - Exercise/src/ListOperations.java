import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
        String comanda = scanner.nextLine();
        while (!comanda.equals("End")) {
            String[] array = comanda.split(" ");
            int element = Integer.parseInt(array[array.length - 1]);
            if (comanda.contains("Add")) {
                numbers.add(element);
            } else if (comanda.contains("Insert")) {
                int index = Integer.parseInt(array[array.length - 2]);
                if (element >= 0 && element<numbers.size()) {
                    numbers.add(element, index);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (comanda.contains("Remove")) {
                if (element >= 0 && element<numbers.size()) {
                    numbers.remove(element);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (comanda.contains("Shift left")) {
                for (int i = 0; i < element; i++) {
                    int a = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(a);
                }
            } else if(comanda.contains("Shift right")) {
                for (int z = 0; z < element; z++) {
                    int a = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, a);
                }

            }
            comanda = scanner.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}