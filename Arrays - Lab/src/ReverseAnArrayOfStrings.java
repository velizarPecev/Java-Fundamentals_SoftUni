import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arr = scanner.nextLine().split(" ");

        for (int i = 0; i < arr.length / 2; i++) {
            String oldElemt = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i]=oldElemt;
        }
        System.out.println(String.join(" ",arr));
    }
}
