import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        long fact = factoriel(num1);
        long fact2 = factoriel(num2);
        double result = fact/(fact2*1.0);

        System.out.printf("%.2f",result);

    }

    static long factoriel(int num) {
        long fact = 1;

        for (int i = 2; i <= num; i++) {
            fact *= i;
        }

        return fact;

    }
}