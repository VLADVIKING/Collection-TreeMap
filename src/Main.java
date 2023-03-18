import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Person> person = new ArrayList<>();

        person.add(new Person("Ivan", "Petrov-Vodkin", 17));
        person.add(new Person("Vasya", "Pupkin", 39));
        person.add(new Person("Anya", "Zhukova-Vnukova", 16));
        person.add(new Person("Kolya", "Ivashov-Petrov-Muzikin", 25));
        person.add(new Person("Masha", "Slobodina Pegova", 23));
        Predicate<Person> predicate = (x) -> {
            for (int i = 0; i < person.size(); i++) {
                if (x.getAge() < 18)
                    return true;
            }
            return false;
        };
        person.removeIf(predicate);

        Collections.sort(person, new PersonComparator(2));
        for (Person p : person) {
            System.out.println(p.getName() + " " + p.getSurname() + " " + p.getAge());
        }
    }
}