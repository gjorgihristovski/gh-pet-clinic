package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by gjorgi.hristovski on 30-Oct-18 in 08:16
 * Created in guru.springframework.sfgpetclinic.services for sfg-pet-clinic
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
