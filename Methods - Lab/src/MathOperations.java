import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (operator) {
            case "*":
                System.out.println(multiply(num, num2));
                break;
            case "/":
                System.out.println(divided(num, num2));
                break;
            case "+":
                System.out.println(sum(num, num2));
                break;
            case "-":
                System.out.println(subtraction(num, num2));
                break;
        }
    }

    static int multiply(int num, int num2) {
        return num * num2;
    }

    static int divided(int num, int num2) {
        return num / num2;
    }

    static int subtraction(int num, int num2) {
        return num - num2;
    }

    static int sum(int num, int num2) {
        return num + num2;
    }
}
