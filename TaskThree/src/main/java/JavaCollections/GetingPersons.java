package JavaCollections;

import java.util.List;

class GetsPersons {

    public static void getsPerson (List<Person> personList) {
        for (Person person : personList) {
            System.out.println(person.getName() + " " + person.getSurname() + " " + person.getBirthYear() + " " +
                    person.getHeight() + " " + person.getWeight());
        }
    }
}
