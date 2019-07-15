import java.util.Scanner;

public class MultiplyEvensbyOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));
        int even = sumEvenNumber(number);
        int odd = sumOddNumber(number);
        System.out.println(even * odd);

    }

    static int sumEvenNumber(int number) {
        int sum = 0;
        while (number > 0) {
            int ostatak = number % 10;
            number /= 10;
            if (ostatak % 2 == 0) {
                sum += ostatak;
            }
        }
        return sum;
    }

    static int sumOddNumber(int number) {
        int sum = 0;
        while (number > 0) {
            int ostatak = number % 10;
            number /= 10;
            if (ostatak % 2 == 1) {
                sum += ostatak;
            }
        }
        return sum;
    }
}