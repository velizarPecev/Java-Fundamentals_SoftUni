import java.awt.event.MouseAdapter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> users = new HashMap<>();
        Map<String,Integer> languages = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("exam finished")){
            String[] tokens = input.split("-");
            String username = tokens[0];
            String language = tokens[1];
            if (language.equals("banned")){
                users.remove(username);
                input = scanner.nextLine();
                continue;
            }
            int currPoints = Integer.parseInt(tokens[2]);


            if (!users.containsKey(username)){
                users.put(username,currPoints);
            }else{
                int pointsSoFar = users.get(username);
                if (pointsSoFar<currPoints){
                    users.put(username,currPoints);
                }
            }
            if (!languages.containsKey(language)){
                languages.put(language,1);
            }else{
                int count = languages.get(language)+1;
                languages.put(language,count);
            }

            input = scanner.nextLine();

        }
        System.out.println("Results:");
        users.entrySet().stream().sorted((f,s)->{
            int result = s.getValue().compareTo(f.getValue());
            if (result==0){
                result = f.getKey().compareTo(s.getKey());
            }
            return result;
        }).forEach(entry->System.out.printf("%s | %d%n",entry.getKey(),entry.getValue()));

        System.out.println("Submissions:");
        languages.entrySet().stream().sorted((f,s)->{
            int result = s.getValue().compareTo(f.getValue());
            if (result==0){
                result = f.getKey().compareTo(s.getKey());
            }
            return result;
        }).forEach(entry->System.out.printf("%s - %d%n",entry.getKey(),entry.getValue()));
    }
}
