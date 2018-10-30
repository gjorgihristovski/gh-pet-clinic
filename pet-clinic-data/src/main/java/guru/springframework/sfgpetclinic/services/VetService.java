package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by gjorgi.hristovski on 30-Oct-18 in 08:19
 * Created in guru.springframework.sfgpetclinic.services for sfg-pet-clinic
 */
public interface VetService {
    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
