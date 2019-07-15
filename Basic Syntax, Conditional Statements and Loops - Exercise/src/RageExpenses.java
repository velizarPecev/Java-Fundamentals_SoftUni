import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int trashedHeadset = lostGames / 2;
        int trashedMouse = lostGames / 3;
        int trashedKeyboards = lostGames / 6;
        int trashedDisplays = lostGames / 12;

        double gameCost = trashedHeadset*headsetPrice+trashedMouse*mousePrice+trashedKeyboards*keyboardPrice+trashedDisplays*displayPrice;

        System.out.printf("Rage expenses: %.2f lv.",gameCost);
    }
}
