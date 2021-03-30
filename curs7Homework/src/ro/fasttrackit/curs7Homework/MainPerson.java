package ro.fasttrackit.curs7Homework;

public class MainPerson {
    public static void main(String... args) {
        Person firstPerson = new Person("Andrei",11, false);
        System.out.println(firstPerson.getName());
        System.out.println(firstPerson.getAge());
        firstPerson.isMaried();
        firstPerson.personDetails();

        Person secondPerson = new Person("Calin",54, true);
        System.out.println(secondPerson.getName());
        System.out.println(secondPerson.getAge());
        secondPerson.isMaried();

        Person thirdPerson = new Person("Maria",18, false);
        System.out.println(thirdPerson.getName());
        System.out.println(thirdPerson.getAge());
        thirdPerson.isMaried();

    }
}
