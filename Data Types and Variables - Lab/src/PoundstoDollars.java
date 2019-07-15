import java.util.Scanner;

public class PoundstoDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double pounds = Double.parseDouble(scanner.nextLine());

        double usd = pounds*1.31;

        System.out.printf("%.3f", usd);
    }
}
