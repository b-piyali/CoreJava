package generics.pluralsight._3_classes_interfaces;

import generics.pluralsight._2_collections.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExamples {
    public static void main(String[] args) {
        Person pg = new Person("Piyali G", 40);
        Person ab = new Person("Abhijit B", 44);
        Person atB = new Person("Atreyi B", 3);

        List<Person> persons = new ArrayList<>();
        persons.add(pg);
        persons.add(ab);
        persons.add(atB);
        System.out.println(persons);

        Collections.sort(persons, Comparator.comparingInt(Person::getAge));
        System.out.println(persons);

        //Collections.sort(persons, new ReverseComparator<>(new AgeComparator()));
        Collections.sort(persons, (left, right) -> -1 * Integer.compare(left.getAge(), right.getAge()));
        System.out.println(persons);
    }
}
