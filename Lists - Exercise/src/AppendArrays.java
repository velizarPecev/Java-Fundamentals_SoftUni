import java.util.ArrayList;
import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|+");

        ArrayList<Integer> appended = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {

            String[] current = input[i].split("\\s+");

            for (String num : current) {

                if (!num.equals("")) {
                    appended.add(Integer.parseInt(num));
                }
            }
        }

        for (Integer integer : appended) {
            System.out.print(integer + " ");
        }
    }
}
