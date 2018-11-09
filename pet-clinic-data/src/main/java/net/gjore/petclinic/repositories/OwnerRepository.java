package net.gjore.petclinic.repositories;

import net.gjore.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gjorgi.hristovski on 06-Nov-18 in 10:28
 * Created in guru.springframework.sfgpetclinic.repositories for sfg-pet-clinic
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
