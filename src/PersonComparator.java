import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    private int maxWords;

    public PersonComparator(int maxWords) {
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String surname1 = o1.getSurname();
        String surname2 = o2.getSurname();
        String words1[] = surname1.split("-");
        String words2[] = surname2.split("-");
        if (words1.length >= maxWords && words2.length >= maxWords) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else if (words1.length > words2.length) {
            return -1;
        } else if (words1.length < words2.length) {
            return 1;
        }
        return Integer.compare(o2.getAge(), o1.getAge());
    }

}
