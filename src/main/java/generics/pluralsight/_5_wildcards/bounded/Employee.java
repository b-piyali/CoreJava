package generics.pluralsight._5_wildcards.bounded;

import generics.pluralsight._2_collections.Person;

public class Employee extends Person {
    public Employee(String name, int age) {
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
