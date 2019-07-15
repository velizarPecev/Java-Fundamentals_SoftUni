import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= num; i++) {
            printTriangle(1,i);
        }
        for (int i = num-1; i >= 1; i--) {
            printTriangle(1,i);
        }
    }

    static void printTriangle (int start, int end){
        for (int i = start; i <= end; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
