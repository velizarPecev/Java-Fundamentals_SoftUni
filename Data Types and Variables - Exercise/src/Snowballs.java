import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());

        long maxValue = 0;
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;
        while (numberOfSnowballs-- > 0){
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            long snowballValue = (long)Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (snowballValue > maxValue){
                maxValue = snowballValue;
                bestSnow = snowballSnow;
                bestTime = snowballTime;
                bestQuality = snowballQuality;
            }
        }
        System.out.println(String.format("%d : %d = %d (%d)",bestSnow,bestTime,maxValue, bestQuality));
    }
}
