import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
        Map<Double,Integer> map = new TreeMap<>();
        for (double num: numbers) {
            if (!map.containsKey(num)){
                map.put(num,0);
            }
            map.put(num,map.get(num) +1);
        }
        for (Map.Entry<Double,Integer>nums:map.entrySet()){
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n",df.format(nums.getKey()),nums.getValue());
        }
    }
}
