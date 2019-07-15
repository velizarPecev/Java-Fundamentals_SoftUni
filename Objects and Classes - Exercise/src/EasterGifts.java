import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EasterGifts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String>gifts = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String action;

        while (!"No Money".equals(action = scanner.nextLine())) {
            String [] com = action.split("\\s+");

            switch (com[0]){
                case "OutOfStock":
                    replaceGiftWithNone(gifts,com[1]);
                    break;
                case "Required":
                    replaceGiftInIndex(gifts,com[1],Integer.parseInt(com[2]));
                    break;
                case "JustInCase":
                    setLastIndexGift(gifts,com[1]);
                    break;
            }


        }
        gifts=gifts.stream().filter(e->!e.equals("None")).collect(Collectors.toList());
        System.out.println(gifts.toString().replaceAll("[\\[\\],]",""));
    }

    private static void setLastIndexGift(List<String> gifts, String word) {

        gifts.set(gifts.size()-1,word);

    }

    private static void replaceGiftInIndex(List<String> gifts, String word, int index) {

        if (index>=0&&index<gifts.size()-1){
            gifts.set(index,word);
        }

    }

    private static void replaceGiftWithNone(List<String> gifts, String word) {

        for (int i = 0; i < gifts.size(); i++) {
            if (gifts.get(i).equals(word)){
                gifts.set(i,"None");
            }
        }

    }
}
