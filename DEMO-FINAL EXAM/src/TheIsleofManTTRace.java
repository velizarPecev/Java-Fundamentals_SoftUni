import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class TheIsleofManTTRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String cordinates = null;
        while (cordinates == null) {
            String input = scanner.nextLine();

            Pattern pattern = Pattern.compile("^([#$%*&])(?<name>[A-Za-z]+)\\1=(?<length>\\d+)!!(?<geoHashCode>.+)$");
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String name = matcher.group("name");
                int length = Integer.parseInt(matcher.group("length"));
                String geoHashCode = matcher.group("geoHashCode");

                if (length == geoHashCode.length()) {
                    cordinates = name + " -> " + encrypt(geoHashCode, length);
                }else{
                    System.out.println("Nothing found!");
                }
            }else{
                System.out.println("Nothing found!");
            }
        }
        System.out.printf("Coordinates found! %s", cordinates);
    }
    private static String encrypt(String s, int encriptionKey) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char enkryptedCh = (char) (ch + encriptionKey);

            sb.append(enkryptedCh);
        }

        return sb.toString();
    }
}
