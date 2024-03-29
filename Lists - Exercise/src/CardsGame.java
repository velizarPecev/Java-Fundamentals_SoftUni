import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondCards = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        while (!(firstCards.isEmpty() || secondCards.isEmpty())) {
            if (firstCards.get(0).equals(secondCards.get(0))) {
                firstCards.remove(0);
                secondCards.remove(0);
            } else if (firstCards.get(0) > secondCards.get(0)) {
                firstCards.add(firstCards.get(0));
                firstCards.add(secondCards.get(0));
                firstCards.remove(0);
                secondCards.remove(0);
            }else{
                secondCards.add(secondCards.get(0));
                secondCards.add(firstCards.get(0));
                secondCards.remove(0);
                firstCards.remove(0);
            }

        }
        if (firstCards.isEmpty()) {
            for (int i = 0; i < secondCards.size(); i++) {
                sum += secondCards.get(i);
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            for (int i = 0; i < firstCards.size(); i++) {
                sum += firstCards.get(i);
            }
            System.out.printf("First player wins! Sum: %d", sum);

        }
    }
}
