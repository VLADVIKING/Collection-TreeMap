import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        List<Person> person = new ArrayList<>();

        person.add(new Person("Ivan", "Petrov-Vodkin", 45));
        person.add(new Person("Vasya", "Pupkin", 39));
        person.add(new Person("Anya", "Zhukova-Vnukova", 34));
        person.add(new Person("Kolya", "Ivashov-Petrov-Muzikin", 25));
        person.add(new Person("Masha", "Slobodina Pegova", 23));
        Comparator<Person> comparator;
        comparator = (o1, o2) -> {
            String surname1 = o1.getSurname();
            String surname2 = o2.getSurname();
            String words1[] = surname1.split("\\P{IsAlphabetic}+");
            String words2[] = surname2.split("\\P{IsAlphabetic}+");
            if (words1.length >= 2 && words2.length >= 2) {
                return Integer.compare(o2.getAge(), o1.getAge());
            } else if (words1.length > words2.length) {
                return -1;
            } else if (words1.length < words2.length) {
                return 1;
            }
            return Integer.compare(o2.getAge(), o1.getAge());
        };
        Collections.sort(person, comparator);
        for (Person p : person) {
            System.out.println(p.getName() + " " + p.getSurname() + " " + p.getAge());
        }
    }
}