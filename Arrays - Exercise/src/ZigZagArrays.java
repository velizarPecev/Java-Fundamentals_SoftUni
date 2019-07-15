import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] first = new int[n];
        int [] second = new int[n];
         for (int i = 0; i < n; i++) {

             String[] input = scanner.nextLine().split(" ");

             int firstElement = Integer.parseInt(input[0]);
             int secondtElement = Integer.parseInt(input[1]);

             if (i%2 == 0){
                 first[i] = firstElement;
                 second[i] = secondtElement;
             }else{
                 second[i] = firstElement;
                 first[i] = secondtElement;
             }
        }

        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i]+ " ");
        }
    }
}
