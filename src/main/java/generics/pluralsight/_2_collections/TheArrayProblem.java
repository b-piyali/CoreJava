package generics.pluralsight._2_collections;

import java.util.Arrays;

public class TheArrayProblem {
    public static void main(String[] args) {
        Person pg = new Person("Piyali G", 40);
        Person ab = new Person("Abhijit B", 44);

        Person[] persons = {pg, ab};
        System.out.println(Arrays.toString(persons));

        Person atB = new Person("Atreyi B", 3);
        persons = add(atB, persons);
        System.out.println(Arrays.toString(persons));

    }

    private static Person[] add(final Person person, Person[] persons) {
        final int length = persons.length;
        persons = Arrays.copyOf(persons, length+1);
        persons[length] = person;

        return persons;
    }
}
