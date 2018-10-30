package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by gjorgi.hristovski on 30-Oct-18 in 08:24
 * Created in guru.springframework.sfgpetclinic.model for sfg-pet-clinic
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
