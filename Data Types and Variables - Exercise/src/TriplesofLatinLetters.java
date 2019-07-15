import java.util.Scanner;

public class TriplesofLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int begin = 97;
        for (int i = begin; i < 97 + n; i++) {
            for (int j = begin; j < 97 + n; j++) {
                for (int k = begin; k < 97 + n; k++) {
                    System.out.printf("%c%c%c%n", i,j,k);

                }
            }
        }
    }
}
