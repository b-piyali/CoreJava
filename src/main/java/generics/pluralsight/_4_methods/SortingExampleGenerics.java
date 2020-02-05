package generics.pluralsight._4_methods;

import generics.pluralsight._2_collections.Person;
import generics.pluralsight._3_classes_interfaces.AgeComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class SortingExampleGenerics {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Piyali B", 40));
        persons.add(new Person("Abhijit B", 44));
        persons.add(new Person("Atreyi B", 3));
        persons.add(new Person("Dulal G", 78));
        System.out.println(persons);

        final Person youngestMem = minMem(persons, new AgeComparator());
        System.out.println(youngestMem);
    }

    private static <T> T minMem(List<T> values, Comparator<T> comparator) {
        if (values.isEmpty())
            throw new IllegalArgumentException("List is empty, can't find minimum.");
        T lowestElement = values.get(0);
        for (int i = 0; i < values.size(); i++) {
            T element = values.get(i);
            lowestElement = (comparator.compare(element, lowestElement) < 0) ? element : lowestElement;
        }
        return lowestElement;
    }
}
