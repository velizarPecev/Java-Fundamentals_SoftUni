import java.util.*;

public class FeedtheAnimals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> animals = new LinkedHashMap<>();
        Map<String,Integer> areas = new LinkedHashMap<>();

        String input = scanner.nextLine();
        int count = 0;
        while (!input.equals("Last Info")){
            String[] commands = input.split(":");

            String addOrFeed = commands[0];
            String animalName = commands[1];
            String dailyFoodLimit = commands[2];
            String area = commands[3];

            if (addOrFeed.equals("Add")){
                if (!animals.containsKey(animalName)){
                    animals.put(animalName,Integer.parseInt(dailyFoodLimit));
                    if (!areas.containsKey(area)){
                        areas.put(area,1);
                    }else{
                        areas.put(area,areas.get(area)+1);
                    }
                }else {
                    int lastValue = animals.get(animalName)+ Integer.parseInt(dailyFoodLimit);
                    animals.put(animalName, lastValue);
                }
            }else if (addOrFeed.equals("Feed")){
                if (animals.containsKey(animalName)){
                    int lastValue = animals.get(animalName) - Integer.parseInt(dailyFoodLimit);
                    if (lastValue<=0){
                        animals.remove(animalName);
                        System.out.printf("%s was successfully fed%n",animalName);
                        areas.put(area,areas.get(area)-1);
                    }else{
                        animals.put(animalName,lastValue);
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Animals:");
        animals.entrySet().stream().sorted((a,b)->Integer.compare(b.getValue(),a.getValue())).filter(i -> i.getValue() > 0).forEach(stringIntegerEntry -> {
            System.out.printf("%s -> %dg%n",stringIntegerEntry.getKey(),stringIntegerEntry.getValue());

        });
        System.out.println("Areas with hungry animals:");
        areas.entrySet().stream().sorted((a,b)->Integer.compare(b.getValue(),a.getValue())).filter(i -> i.getValue()>0).forEach(stringIntegerEntry -> {
            System.out.printf("%s : %d%n",stringIntegerEntry.getKey(),stringIntegerEntry.getValue());

        });
    }
}
