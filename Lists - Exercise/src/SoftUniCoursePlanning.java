import java.io.Console;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<String> courseSU = Arrays.stream(input.split(", ")).collect(Collectors.toList());

        String[] command = scanner.nextLine().split("\\:+");
        while (!command[0].equals("course start")) {
            switch (command[0]) {
                case "Add":
                    int n = courseSU.indexOf(command[1]);
                    if (n < 0) {
                        courseSU.add(command[1]);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    if (index >= 0 && index < courseSU.size()) {
                        n = courseSU.indexOf(command[1]);
                        if (n < 0) {
                            courseSU.add(index, command[1]);
                        }
                    }
                    break;
                case "Remove":
                    n = courseSU.indexOf(command[1]);
                    String exercise = command[1] + "-Exercise";
                    if (n >= 0) {
                        if ((n + 1) < courseSU.size()) {
                            if (courseSU.get(n + 1).equals(exercise)) {
                                courseSU.remove(n + 1);
                            }
                        }
                        courseSU.remove(n);
                    }
                    break;
                case "Swap":
                    int n1 = courseSU.indexOf(command[1]);
                    int n2 = courseSU.indexOf(command[2]);
                    boolean one = false;
                    boolean two = false;
                    if ((n1 + 1) < courseSU.size() && (n2 + 1) < courseSU.size()) {
                        one = courseSU.get(n1 + 1).equals(command[1] + "-Exercise");
                        two = courseSU.get(n2 + 1).equals(command[2] + "-Exercise");
                    }
                    if (n2 >= 0 && n1 >= 0) {
                        if (one && two) {
                            String rotation = courseSU.get(n1);
                            courseSU.set(n1, courseSU.get(n2));
                            courseSU.set(n2, rotation);
                            rotation = courseSU.get(n1 + 1);
                            courseSU.set(n1 + 1, courseSU.get(n2 + 1));
                            courseSU.set(n2 + 1, rotation);
                        } else if (one && !two) {
                            String rotation = courseSU.get(n1);
                            courseSU.set(n1, courseSU.get(n2));
                            courseSU.set(n2, rotation);
                            courseSU.add(n2 + 1, courseSU.get(n1 + 1));
                            courseSU.remove(n1 + 1);
                        } else if (!one && two) {
                            String rotation = courseSU.get(n1);
                            courseSU.set(n1, courseSU.get(n2));
                            courseSU.set(n2, rotation);
                            courseSU.add(n1 + 1, courseSU.get(n2 + 1));
                            courseSU.remove(n2 + 2);
                        } else {
                            String rotation = courseSU.get(n1);
                            courseSU.set(n1, courseSU.get(n2));
                            courseSU.set(n2, rotation);
                        }
                    }
                    break;
                case "Exercise":
                    n1 = courseSU.indexOf(command[1]);
                    exercise = command[1] + "-" + command[0];
                    n2 = courseSU.indexOf(exercise);
                    if (n1 >= 0) {
                        if (n2 < 0) {
                            courseSU.add(n1 + 1, exercise);
                        }
                    } else {
                        courseSU.add(command[1]);
                        courseSU.add(exercise);
                    }
                    break;
                default:
                    break;
            }
            command = scanner.nextLine().split("\\:+");
        }
        for (int i = 0; i < courseSU.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, courseSU.get(i));
        }
    }
}