import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> junk = new TreeMap<>();
        
        Map<String, Integer> key = new HashMap<>();

        key.put("motes",0);
        key.put("fragments",0);
        key.put("shards",0);

        int[] collectedValues = new int[3];
        boolean notAttend = false;
        while (!notAttend){
            String[] tokens = scanner.nextLine().split(" ");


            for (int i = 0; i < tokens.length; i+=2) {
                int quatity = Integer.parseInt(tokens[i]);
                String material = tokens[i+1].toLowerCase();


                if (key.containsKey(material)){
                    int value = key.get(material);
                    key.put(material,value+quatity);

                    if (material.equals("motes")){
                        collectedValues[0]+=quatity;
                        notAttend = collectedValues[0]>=250;
                    }else if (material.equals("fragments")){
                        collectedValues[1]+=quatity;
                        notAttend = collectedValues[1]>=250;
                    }else if (material.equals("shards")){
                        collectedValues[2]+=quatity;
                        notAttend = collectedValues[2]>=250;
                    }
                    if (notAttend){
                        break;
                    }

                }else{
                    if (!junk.containsKey(material)){
                        junk.put(material,quatity);
                    }else {
                        junk.put(material,junk.get(material)+quatity);
                    }
                }
            }
        }
        String itemName = "";
        if (collectedValues[0]>=250){
            int value = key.get("motes") - 250;
            key.put("motes",value);
            itemName = "Dragonwrath";
        }else if (collectedValues[1]>=250){
            int value = key.get("fragments") - 250;
            key.put("fragments",value);
            itemName = "Valanyr";
        }else {
            int value = key.get("shards") - 250;
            key.put("shards",value);
            itemName = "Shadowmourne";
        }

        System.out.println(itemName+" obtained!");

        key.entrySet().stream().sorted((f,s)->{
            int result = s.getValue().compareTo(f.getValue());

            if (result==0){
                result = f.getKey().compareTo(s.getKey());
            }
            return result;

        }).forEach(entry->System.out.printf("%s: %d%n",entry.getKey(),entry.getValue()));



        for (Map.Entry<String, Integer> entry : junk.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
        }

    }
}
