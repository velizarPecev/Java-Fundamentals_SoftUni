import java.util.Scanner;

public class PartyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int companions = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int allCoins =  days*50;
        for (int i = 1; i <= days; i++) {

            if (i % 10 == 0)
            {
                companions -= 2;
            }

            // every 15th (fifteenth) day 5 (five) new companions are joined at the beginning of the day
            if (i % 15 == 0)
            {
                companions += 5;
            }

            // Every 3rd
            if (i % 3 == 0)
            {
                allCoins -= companions * 3;
            }

            // Every 5th
            if (i % 5 == 0)
            {
                int earnedCoins = 20;
                allCoins += earnedCoins * companions;
                if (i % 3 == 0)
                {
                    allCoins -= companions * 2;
                }
            }

            allCoins -= companions * 2;

        }
        int coinsPerPerson = allCoins / companions;
        System.out.printf("%d companions received %d coins each.", companions,coinsPerPerson);
    }
}
