import java.util.List;
import java.util.stream.Collectors;

public class DebugMain {


    public static void main(String[] args) {
        List<String> personFirstNameList = PersonDB.getPersonMockList()//get mock person list
                .stream()
                .filter(person -> person.getSalary() > 1000.0)//filtering logic
                .map(Person::getFirstName)//map filtered data
                .distinct()//select only distinct values
                .sorted()//sort filtered distinct data
                .skip(0)//skip first element
                .limit(2)//limit results to 2
                .collect(Collectors.toList());//collect data as list

        System.out.println(personFirstNameList);

    }
}
