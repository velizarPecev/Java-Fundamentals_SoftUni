import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int count = 0;
        int max = 0;
        int start = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]){
                count++;

                if (count>max){
                    start = i - count;
                    max = count;
                }
            }else{
                count = 0;
            }
        }

        for (int j = start+1; j <= start+max+1; j++) {
            System.out.print(nums[j]+" ");
        }
    }
}
