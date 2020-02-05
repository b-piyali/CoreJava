package generics.pluralsight._2_collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        Person pg = new Person("Piyali G", 40);
        Person ab = new Person("Abhijit B", 44);

        List<Person> persons = new ArrayList<>();
        persons.add(pg);
        persons.add(ab);
        System.out.println(persons);
        Person atB = new Person("Atreyi B", 3);
        persons.add(atB);
        System.out.println(persons);
        System.out.println(persons.size());
    }
}
