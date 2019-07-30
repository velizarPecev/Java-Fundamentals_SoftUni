import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String regex = "^>+([?<furniture>A-Z{0,}a-z]+)+<<(?<price>\\d+\\.?\\d+)+!([?<quantity>\\d+]+)\\b";
        double totalCost = 0;
        System.out.println("Bought furniture:");
        while (!line.equals("Purchase")){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);

            if (matcher.find()){
                String furniture = matcher.group(1);
                double price = Double.parseDouble(matcher.group(2));
                double quantity = Double.parseDouble(matcher.group(3));
                System.out.println(furniture);
                totalCost += price * quantity;
            }

            line = reader.readLine();
        }
        System.out.printf("Total money spend: %.2f", totalCost);
    }
}