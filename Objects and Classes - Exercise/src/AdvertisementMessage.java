import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public class random{
        String random;   
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Random rnd = new Random();

        String[] phrases = {"Excellent product."+"Such a great product."+"I always use that product."+
                "Best product of its category."+ "Exceptional product."+ "I can’t live without this product."};
        String[] events = {"Now I feel good."+"I have succeeded with this product."+"Makes miracles. I am happy of the results!"+
                "I cannot believe but now I feel awesome."+"Try it yourself, I am very satisfied."+"I feel great!"};
        String[] autors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String [] citis = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};


        for (int i = 0; i < n; i++) {
            int phrase = rnd.nextInt(phrases.length);
            int event = rnd.nextInt(events.length);
            int autor = rnd.nextInt(autors.length);
            int city = rnd.nextInt(citis.length);
            System.out.printf(String.join(" ",phrases[phrase] + " " + events[event] + " "+ autors[autor] + " - " + citis[city]));
        }
    }
}
