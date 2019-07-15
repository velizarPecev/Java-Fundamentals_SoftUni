import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;
        if (age >= 0 && age <= 18) {
            if (day.equals("Weekday")) {
                price = 12;
            } else if (day.equals("Weekend")) {
                price = 15;
            } else if (day.equals("Holiday")) {
                price = 5;
            }
        } else if (age > 18 && age <= 64) {
            if (day.equals("Weekday")) {
                price = 18;
            } else if (day.equals("Weekend")) {
                price = 20;
            } else if (day.equals("Holiday")) {
                price = 12;
            }
        } else if (age > 64 && age <= 122) {
            if (day.equals("Weekday")) {
                price = 12;
            } else if (day.equals("Weekend")) {
                price = 15;
            } else if (day.equals("Holiday")) {
                price = 10;
            }
        } else {
            System.out.println("Error!");
            return;
        }

        System.out.println(price+"$");
    }
}
