import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String str = "";

        while (!command.equals("End")) {
            String[] tokens = command.split(" ");

            if (tokens[0].equals("Add")) {
                str += (tokens[1]);
            }
            if (tokens[0].equals("Upgrade")) {
                    String old = tokens[1];
                    String neww = (char) (tokens[1].charAt(0) + 1)+"";
                    str = str.replace(old, neww);
            }
            if (tokens[0].equals("Print")) {
                System.out.println(str);
            }
            if (tokens[0].equals("Index")) {
                if (str.contains(tokens[1])) {
                    char ch = tokens[1].charAt(0);
                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == ch) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                } else {
                    System.out.println("None");
                }
            }
            if (tokens[0].equals("Remove")) {
                str = str.replace(tokens[1], "");
            }
            command = scanner.nextLine();
        }
    }
}