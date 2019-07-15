import java.lang.reflect.Array;
        import java.util.Arrays;
        import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int Evensum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                Evensum += arr[i];
            }
        }
        System.out.println(Evensum);
    }
}
