import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNumber = scanner.nextLine();

        int factSum = 0;
        for (int i = 0; i < inputNumber.length(); i++) {
            int digit = inputNumber.charAt(i) - '0';


            int factoriel = 1;
            for (int j = 2; j <= digit; j++) {
                factoriel *= j;
            }
            factSum += factoriel;
        }

        if ((factSum + "").equals(inputNumber)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
