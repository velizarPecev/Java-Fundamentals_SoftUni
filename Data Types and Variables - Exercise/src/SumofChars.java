import java.util.Scanner;

public class SumofChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (char i = 0; i < n; i++) {
            char lattin = scanner.nextLine().charAt(0);

            sum+= lattin;
        }
        System.out.println("The sum equals: "+sum);
    }
}
