import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        System.out.println(midle(str));
    }

    static String midle (String str){

        int position;
        int length;

        if (str.length()%2==0){
            position = str.length()/2-1;
            length = 2;
        }else{
            position = str.length() / 2;
            length = 1;
        }

        return str.substring(position,position+length);
    }
}
