import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        int[] numbers = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }
        for (int begin = 0; begin < numbers.length; begin++) {

            int number = numbers[begin];
            boolean isTopNumber = true;

            for (int i = begin + 1; i < numbers.length; i++) {
                if (number <= numbers[i]) {
                    isTopNumber = false;
                    break;
                }
            }

            if (isTopNumber) {
                System.out.print(number + " ");
            }
        }
    }
}
