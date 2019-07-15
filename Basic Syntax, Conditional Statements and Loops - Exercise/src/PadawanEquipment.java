import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double sabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double totalPrice = sabersPrice * Math.ceil(students*1.1)+robesPrice*students+beltsPrice*(students-students/6);

        if (budget>=totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
        }else{
            System.out.printf("Ivan Cho will need %.2flv more.",totalPrice-budget);
        }
    }
}
