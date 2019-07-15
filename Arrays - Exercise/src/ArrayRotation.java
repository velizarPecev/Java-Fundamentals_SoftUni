import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        int[] number = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            number[i] = Integer.parseInt(arr[i]);
        }

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            int firstElement = number[0];

            for (int j = 0; j < arr.length - 1; j++) {
                number[j] = number[j + 1];
            }

            number[number.length - 1] = firstElement;
        }
            for (int k = 0; k < number.length; k++) {
                System.out.print(number[k] + " ");
            }

    }
}
