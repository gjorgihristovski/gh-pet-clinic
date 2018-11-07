package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by gjorgi.hristovski on 29-Oct-18 in 13:18
 * Created in guru.springframework.sfgpetclinic.model for sfg-pet-clinic
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

    private String name;


}
