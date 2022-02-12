package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMan {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Bilbo", "Baggins", 1991, 125, 123));
        personList.add(new Person("James", "Smith", 1998, 165, 61));
        personList.add(new Person("Amy", "Johnson", 1966, 150, 79));
        personList.add(new Person("Kelly", "Clarkson", 1989, 176, 58));
        personList.add(new Person("Bob", "Brown", 1972, 159, 86));
        personList.add(new Person("Michael", "Jackson", 1985, 201, 45));

        Collections.sort(personList);
        GetsPersons.getsPerson(personList);

        System.out.println();

        Collections.sort(personList, Person.heightComparator);
        GetsPersons.getsPerson(personList);

        System.out.println();

        Collections.sort(personList, Person.weightComparator);
        GetsPersons.getsPerson(personList);
    }
}
