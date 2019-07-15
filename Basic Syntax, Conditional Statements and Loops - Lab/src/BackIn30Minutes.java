import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());


        int minutesAfter = minutes+30;

        if (minutesAfter >= 60){
            hours += 1;
            minutesAfter -= 60;
        }
        if (hours>23){
            hours = 0;
        }

        System.out.printf("%d:%02d",hours,minutesAfter);
    }
}
