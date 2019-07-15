import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int spice = number;
        int total = 0;
        while (number >= 100) {
            days++;
            spice = number - 26;
            number -= 10;
            total += spice;
            if (number < 100){
                total -= 26;
            }
        }
        System.out.println(days);
        System.out.println(total);
    }
}
