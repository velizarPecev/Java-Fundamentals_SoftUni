import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int best1=0,bestindex=0,bestsum=0,countsamle =0,bestsample=0;
        String[] bestscase = new String[n];
        String input = scanner.nextLine();
        while (!input.equals("Clone them!")){
            countsamle++;
            input = input.replaceAll("!","");
            String[] str = input.split("",n);

            int count1 = 0,temp1 = 0,tempindex =0,tempsum=0;
            for (int i = 0; i < n; i++) {
                if (str[i].equals("1")) {
                    count1++;tempsum++;
                    if (count1>temp1){
                        temp1 = count1;
                        tempindex = i+1-count1;
                    }
                } else {
                    count1=0;
                }
            }

            if (temp1>best1){
                best1 = temp1;bestindex=tempindex;bestsum=tempsum;bestsample=countsamle;
                for (int i = 0; i < n; i++) {
                    bestscase[i]=str[i];
                }
            }else if(temp1==best1 && (tempindex<bestindex || tempsum>bestsum)){
                best1 = temp1;bestindex=tempindex;bestsum=tempsum;bestsample=countsamle;
                for (int i = 0; i < n; i++) {
                    bestscase[i] = str[i];
                }
            }else if (countsamle == 1) {
                best1 = temp1;
                bestindex = tempindex;
                bestsum = tempsum;
                bestsample = countsamle;
                for (int i = 0; i < n; i++) {
                    bestscase[i] = str[i];
                }
            }

            input = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n",bestsample,bestsum );
        for (int i = 0; i < n; i++) {
            System.out.print(bestscase[i]+" ");
        }
    }
}