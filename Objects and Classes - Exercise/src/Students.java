import java.util.*;
import java.util.stream.Collectors;

public class Students {
    static class student {
        private String firstName;
        private String lastName;
        private double grade;

        public student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<student> Personstudent = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");

            String firstName = tokens[0];
            String lastName=tokens[1];
            double grade=Double.parseDouble(tokens[2]);

            student students = new student(firstName,lastName,grade);

            Personstudent.add(students);
        }
        List<student> sortedList = Personstudent.stream()
                .sorted(Comparator.comparingDouble(student::getGrade)
                        .reversed())
                .collect(Collectors.toList());

        for (Students.student student : sortedList) {
            System.out.printf("%s %s: %.2f%n",student.firstName,student.lastName,student.grade);
        }
    }
}
