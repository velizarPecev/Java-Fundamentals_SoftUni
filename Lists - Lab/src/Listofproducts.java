import java.util.*;

public class Listofproducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> str = new ArrayList();

        for (int i = 0; i < n; i++) {
            String fruits = scanner.nextLine();

            str.add(fruits);
        }
        Collections.sort(str);

        for (int i = 0; i < str.size(); i++) {
            System.out.printf("%d.%s%n",i+1,str.get(i));
        }
    }
}
