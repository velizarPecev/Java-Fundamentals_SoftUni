import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int initialPower = pokePower;

        int pokedTargets = 0;

        while (pokePower >= distance){
            pokePower -= distance;
            pokedTargets++;

            if (pokePower == initialPower / 2.00 && exhaustionFactor != 0){
                pokePower /= exhaustionFactor;
            }
        }
        System.out.println(pokePower);
        System.out.println(pokedTargets);
    }
}


