package generics.pluralsight._5_wildcards.bounded;

import generics.pluralsight._2_collections.Person;

public class Partner extends Person {

    public Partner(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Partner{" +
                "name='" + getName() + '/' +
                ", age= " + getAge() +
                "}";
    }
}
