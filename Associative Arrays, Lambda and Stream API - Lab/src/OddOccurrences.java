import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Map<String,Integer> map = new LinkedHashMap<>();

        for (String word:words) {
            String wordInLowerCase = word.toLowerCase();
            if (map.containsKey(wordInLowerCase)){
                map.put(wordInLowerCase,map.get(wordInLowerCase)+1);
            }else{
                map.put(wordInLowerCase,1);
            }
        }
        ArrayList<String> odds = new ArrayList<>();
        for (Map.Entry<String,Integer>entry:map.entrySet()) {
            if (entry.getValue()%2==1) {
                odds.add(entry.getKey());
            }
        }
        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));

            if (i<odds.size()-1){
                System.out.print(", ");
            }
        }
    }
}
