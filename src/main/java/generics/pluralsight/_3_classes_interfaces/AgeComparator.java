package generics.pluralsight._3_classes_interfaces;

import generics.pluralsight._2_collections.Person;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(final Person left, final Person right) {
        return Integer.compare(left.getAge(), right.getAge());
    }

}
