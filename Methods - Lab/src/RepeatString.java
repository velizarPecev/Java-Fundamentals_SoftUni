import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        repeatString();

    }

    private static String repeatString (){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        System.out.print(result);
        return result;
    }
}
