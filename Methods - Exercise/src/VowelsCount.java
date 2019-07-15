import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println(vowelCount(name.toLowerCase()));

    }

    static int vowelCount (String name){
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            if (letter == 'a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
                counter++;
            }
        }
        return counter;
    }
}
