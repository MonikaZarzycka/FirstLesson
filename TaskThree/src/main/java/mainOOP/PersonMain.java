package mainOOP;

public class PersonMain {
    public static void main( String[] args ) {
        Person person1 = new Person("Monika", "Zarzycka", 74634735983L);
        Person person2 = new Person("Monika", "Zarzycka", 93704263806L);
        Person person3 = new Person("Monika", "Zarzycka", 74634735983L);

        System.out.println(person1 + " == " + person2 + " " + person1.equals(person2));
        System.out.println(person2 + " == " + person3 + " " + person2.equals(person3));
        System.out.println(person1 + " == " + person3 + " " + person1.equals(person3));

    }
}
