import java.util.Scanner;

public class RefactorVolumeofPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Length: ");
        double dul = Double.parseDouble(scanner.nextLine());

        System.out.print("Width: ");
        double sh = Double.parseDouble(scanner.nextLine());

        System.out.print("Height: ");
        double V = Double.parseDouble(scanner.nextLine());

        V = (dul * sh * V) / 3;
        System.out.printf("Pyramid Volume: %.2f", V);

    }
}
