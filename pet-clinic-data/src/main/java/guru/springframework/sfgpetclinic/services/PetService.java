package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by gjorgi.hristovski on 30-Oct-18 in 08:18
 * Created in guru.springframework.sfgpetclinic.services for sfg-pet-clinic
 */
public interface PetService {
    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
