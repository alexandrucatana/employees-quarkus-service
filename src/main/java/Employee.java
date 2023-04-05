
import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Cacheable
@Table(name = "employees")
public class Employee extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    public String first_name;
    @Column
    public String last_name;
    @Column
    public String email;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String email) {
        this.first_name = firstName;
        this.last_name = lastName;
        this.email = email;
    }


}
