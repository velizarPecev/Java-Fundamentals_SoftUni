import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student2 {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String city;

        public Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String data = scanner.nextLine();

        while (!data.equals("end")) {
            String[] tokens = data.split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String city = tokens[3];

            if (isStudentExisting(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName, age, city);
            } else {
                Student student = new Student(firstName, lastName, age, city);
                students.add(student);
            }

            data = scanner.nextLine();
        }

        String filterCity = scanner.nextLine();
        students.stream()
                .filter(s -> s.getCity().equals(filterCity))
                .forEach(s -> System.out.println(String.format("%s %s is %d years old", s.firstName, s.lastName, s.age)));
    }

    private static boolean isStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.lastName.equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName, int age, String city) {
        Student existingStudent = null;
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.lastName.equals(lastName)) {
                existingStudent = student;
                existingStudent.age = age;
                existingStudent.city = city;
            }
        }
        return existingStudent;
    }
}