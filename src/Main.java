import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> person = new ArrayList<>();

        person.add(new Person("Ivan", "Petrov-Vodkin", 45));
        person.add(new Person("Vasya", "Pupkin", 39));
        person.add(new Person("Anya", "Zhukova-Vnukova", 34));
        person.add(new Person("Kolya", "Ivashov-Petrov-Muzikin", 25));
        person.add(new Person("Masha", "Slobodina", 23));
        Collections.sort(person, new PersonComparator(2));
        for (Person p : person) {
            System.out.println(p.getName() + " " + p.getSurname() + " " + p.getAge());
        }
    }
}