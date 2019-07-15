import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int capasity = Integer.parseInt(scanner.nextLine());

        while (true){
            String comand = scanner.nextLine();
            if (comand.equals("end")){
                break;
            }
            String[] tokens = comand.split(" ");

            if (comand.contains("Add")){
                int numberToAdd = Integer.parseInt(tokens[1]);
                nums.add(numberToAdd);
            }else{
                int passengers = Integer.parseInt(tokens[0]);
                for (int i = 0; i < nums.size(); i++) {
                    int newPassengersCount = passengers + nums.get(i);

                    if (newPassengersCount<=capasity){
                        nums.set(i,newPassengersCount);
                        break;
                    }
                }


            }

        }
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i)+" ");
        }
    }
}
