import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int number = 0;
        boolean isSpecialNumber = false;


        for (int i = 1; i <= input; i++) {
            number = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            if (isSpecialNumber = (sum == 5) || (sum == 7) || (sum == 11)){
                System.out.printf("%d -> True%n", number);
            }else {
                System.out.printf("%d -> False%n", number);
            }
            sum = 0;
            i = number;
        }
    }
}