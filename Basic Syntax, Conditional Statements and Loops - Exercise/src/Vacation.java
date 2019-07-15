import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String peopleGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        double reduce = 0;
        double reduceB = 0;
        if (day.equals("Friday")){
            if (peopleGroup.equals("Students")){
                price = 8.45;
            }else if (peopleGroup.equals("Business")){
                price = 10.90;
            }else if (peopleGroup.equals("Regular")){
                price = 15;
            }
        }else if (day.equals("Saturday")){
            if (peopleGroup.equals("Students")){
                price = 9.80;
            }else if (peopleGroup.equals("Business")){
                price = 15.60;
            }else if (peopleGroup.equals("Regular")){
                price = 20;
            }
        }else if (day.equals("Sunday")){
            if (peopleGroup.equals("Students")){
                price = 10.46;
            }else if (peopleGroup.equals("Business")){
                price = 16;
            }else if (peopleGroup.equals("Regular")){
                price = 22.50;
            }
        }

        double total = price * people;

        if (peopleGroup.equals("Students")&&people>=30){
            total-=(total*0.15);
        }else if (peopleGroup.equals("Business")&&people>=100){
            total -= (10*price);
        }else if (peopleGroup.equals("Regular")&&people>=10 && people<=20){
            total -= (total*0.05);
        }

        System.out.printf("Total price: %.2f", total);
    }
}