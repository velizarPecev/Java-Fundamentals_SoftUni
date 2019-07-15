import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ages = Integer.parseInt(scanner.nextLine());

        String ageType = "";

        if (ages<=2){
            ageType = "baby";
        }else if (ages<=13){
            ageType = "child";
        }else if (ages<=19){
            ageType = "teenager";
        }else if (ages<=65){
            ageType = "adult";
        }else{
            ageType = "elder";
        }
        System.out.println(ageType);
    }
}
