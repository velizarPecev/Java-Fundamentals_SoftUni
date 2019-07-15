import java.util.Scanner;

public class PrintandSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = begin; i <= end; i++) {
            System.out.print(i);
            System.out.print(" ");
            sum += i;
        }
        System.out.printf("%nSum: %d",sum);
    }
}
