import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");

        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        String ouput = "no";
        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }

            for (int j = i+1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }
            if (leftSum == rightSum){
                ouput = i + "";
            }
        }
        System.out.println(ouput);
    }
}
