import java.util.Scanner;

public class SignofIntegerNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printSignOfInteger(Integer.parseInt(scanner.nextLine()));
    }

    static void printSignOfInteger (int num){

        if (num>0){
            System.out.printf("The number %d is positive.",num);
        }else if (num<0){
            System.out.printf("The number %d is negative.",num);
        }else{
            System.out.printf("The number %d is zero.",num);
        }
    }
}
