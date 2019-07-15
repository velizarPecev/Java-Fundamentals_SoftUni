import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] com = command.split(" ");
            switch (com[0]) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(com[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (com[1].equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    } else {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 != 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;
                    for (int i : numbers) {
                        sum += i;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    if (com[1].equals("<")) {
                        int digit = Integer.parseInt(com[2]);
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) < digit) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    } else if (com[1].equals("<=")) {
                        int digit = Integer.parseInt(com[2]);
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) <= digit) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    } else if (com[1].equals(">")) {
                        int digit = Integer.parseInt(com[2]);
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) > digit) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    } else if (com[1].equals(">=")) {
                        int digit = Integer.parseInt(com[2]);
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) >= digit) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                default:
                    break;
            }
            command = scanner.nextLine();
        }

    }
}

