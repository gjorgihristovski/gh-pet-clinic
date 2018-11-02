package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * Created by gjorgi.hristovski on 02-Nov-18 in 13:44
 * Created in guru.springframework.sfgpetclinic.model for sfg-pet-clinic
 */
public class Visit extends BaseEntity {

    private LocalDate date;
    private String description;
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
