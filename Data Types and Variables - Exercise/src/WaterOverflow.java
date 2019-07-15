;
import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumLitres = 0;
        while (n >= 0) {
            int litres = Integer.parseInt(scanner.nextLine());
            int tank = 255;
            sumLitres+=litres;

            if (sumLitres>tank) {
                System.out.println("Insufficient capacity!");
                sumLitres -= litres;

                if (n==0){
                    break;
                }
            }
            n--;
            if (n==0){
                break;
            }
        }
        System.out.println(sumLitres);

    }
}
