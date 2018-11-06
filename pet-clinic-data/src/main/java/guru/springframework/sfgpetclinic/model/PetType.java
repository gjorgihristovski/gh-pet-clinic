package guru.springframework.sfgpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by gjorgi.hristovski on 29-Oct-18 in 13:18
 * Created in guru.springframework.sfgpetclinic.model for sfg-pet-clinic
 */
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
