import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * person object blue print
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
}
