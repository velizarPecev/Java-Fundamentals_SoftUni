import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                sumOdd += arr[i];
            }else if (arr[i]%2==0){
                sumEven += arr[i];
            }
        }
        System.out.println(sumEven-sumOdd);
    }
}
