import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        order();
    }

    static void order (){
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        double water = 1.00;
        double coffee = 1.50;
        double coke = 1.40;
        double snacks = 2.00;
        double result = 0;

        switch (product){
            case "water":
                result = count*water;
                break;
            case "coffee":
                result = count * coffee;
                break;
            case"coke":
                result = count * coke;
                break;
            case"snacks":
                result = count * snacks;
                break;
        }
        System.out.printf("%.2f",result);
    }

}
