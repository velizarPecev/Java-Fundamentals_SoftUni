import java.util.Scanner;

public class CharactersinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        printChars(first,second);
    }

    static void printChars ( int first, int second){
        for (int i = first+1; i <= second-1; i++) {
            System.out.print((char)i+" ");
        }

        for (int i = second+1; i <= first-1; i++) {
            System.out.print((char)i+" ");
        }
    }
}
