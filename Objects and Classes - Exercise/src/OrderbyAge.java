import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OrderbyAge {
    static class Person{
        private String name;
        private String id;
        private int age;

        public Person (String name, String id, int age){
            this.name = name;
            this.id = id;
            this.age = age;
        }
        public int getAge(){
            return age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] person = input.split(" ");

            String name = person[0];
            String id = person[1];
            int age =Integer.parseInt(person[2]);

            Person person1 = new Person(name,id,age);

            personList.add(person1);
            input = scanner.nextLine();

        }
        personList.sort((f, s) ->f.getAge() - s.getAge());

        for (Person person : personList) {
            System.out.printf("%s with ID: %s is %d years old.%n",person.name,person.id,person.age);
        }

    }
}
