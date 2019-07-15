import java.util.Scanner;

public class EasterCozonacs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double priceForFlour = Double.parseDouble(scanner.nextLine());


        double packOfEggs = 0.75*priceForFlour;
        double priceFor1LMilk = priceForFlour + (priceForFlour*0.25);
        double priceForRecaipMilk = priceFor1LMilk/4;

        double total = packOfEggs+priceForFlour+priceForRecaipMilk;
        int countEggs = 0;
        int countCoz = 0;
        while (budget>=total){
            budget -= total;
            countEggs+=3;
            countCoz++;

            if (countCoz % 3 == 0){
                countEggs -= countCoz-2;
            }
        }

        System.out.printf("You made %d cozonacs! Now you have %d eggs and %.2fBGN left.",countCoz,countEggs,budget);
    }
}
