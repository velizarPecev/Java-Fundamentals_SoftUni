import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" +")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        while (!nums.isEmpty()) {
            boolean isLower = false;
            boolean isGreater = false;
            int n = Integer.parseInt(scanner.nextLine());
            int numberSum=0;
            if(n<0){
                n=0;
                isLower=true;
            }
            if(n>nums.size()-1){
                n=nums.size()-1;
                isGreater=true;
            }
            numberSum=nums.get(n);
            sum+=nums.get(n);
            nums.remove(n);
            if(isLower){
                nums.add(n,nums.get(nums.size()-1));
            }
            if(isGreater){
                nums.add(n,nums.get(0));
            }
            for (int i = 0; i < nums.size(); i++) {
                int currentNumber = nums.get(i);
                if (currentNumber <= numberSum) {
                    nums.set(i,currentNumber+numberSum);
                } else {
                    nums.set(i,currentNumber-numberSum);
                }
            }
        }

        System.out.println(sum);
    }
}

