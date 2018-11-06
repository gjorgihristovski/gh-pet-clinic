package guru.springframework.sfgpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by gjorgi.hristovski on 02-Nov-18 in 13:51
 * Created in guru.springframework.sfgpetclinic.model for sfg-pet-clinic
 */
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
