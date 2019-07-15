import java.util.Scanner;

public class PrintNumbersinReverseOrder1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int [] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            int nums = Integer.parseInt(scanner.nextLine());
            num[i] = nums;
        }
        for (int i = num.length-1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}
