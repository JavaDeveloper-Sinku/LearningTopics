package Lamda;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class  Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class FilterExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("rishi", 20),
                new Person("Go", 20),
                new Person("C#", 20),
                new Person("C++", 20),
                new Person("java", 20)
        );
        //Smart Lambda Use
        List<Person> adult = people.stream()
                .filter(person -> person.age > 18)
                .collect(Collectors.toList());

        List<Person> adult1 = people.stream().
                filter(person -> person.age > 18)
                .collect(Collectors.toList());

        adult.forEach(person ->
                System.out.println(person.name + " is an adult."));

    }
}
