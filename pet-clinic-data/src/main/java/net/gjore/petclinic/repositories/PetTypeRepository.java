package net.gjore.petclinic.repositories;

import net.gjore.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gjorgi.hristovski on 06-Nov-18 in 10:30
 * Created in guru.springframework.sfgpetclinic.repositories for sfg-pet-clinic
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
