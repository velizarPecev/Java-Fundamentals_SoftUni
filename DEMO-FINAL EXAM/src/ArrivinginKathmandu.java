import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrivinginKathmandu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("Last note")) {
            Pattern pattern = Pattern.compile("^(?<name>[A-Za-z0-9!@#$?]+)=(?<length>\\d+)<<(?<geoHashCode>.+)$");
            Matcher matcher = pattern.matcher(input);
            String cordinates = "";
            if (matcher.find()){
                String name = matcher.group("name");
                int length = Integer.parseInt(matcher.group("length"));
                String geoHashCode = matcher.group("geoHashCode");

                if (length == geoHashCode.length()) {
                    for (int i = 0; i < name.length(); i++) {
                        char ch = name.charAt(i);
                        if (Character.isLetterOrDigit(ch)) {
                            cordinates += name.charAt(i);
                        }
                    }
                    System.out.printf("Coordinates found! %s -> %s\n",cordinates,geoHashCode);
                }
                else{
                    System.out.println("Nothing found!");
                }
            }else{
                System.out.println("Nothing found!");
            }

            input = scanner.nextLine();
        }
    }

}
