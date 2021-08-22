import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * class that generate mock objects
 */
public class PersonDB {

    /**
     * method for generate mock person list
     */
    public static List<Person> getPersonMockList() {
        return Stream.of(
                new Person(1, "james", "smith", 1000.0),
                new Person(2, "demi", "lovato", 2000.0),
                new Person(3, "michael", "jackson", 3000.0),
                new Person(4, "ariana", "grande", 4000.0),
                new Person(5, "ariana", "grande", 4000.0),
                new Person(6, "alan", "walker", 900.0),
                new Person(7, "david", "gutta", 1000.0),
                new Person(8, "dua", "lipa", 1100.0),
                new Person(9, "james", "watson", 1300.0),
                new Person(10, "emma", "haester", 5000.0)
        ).collect(Collectors.toList());
    }
}
