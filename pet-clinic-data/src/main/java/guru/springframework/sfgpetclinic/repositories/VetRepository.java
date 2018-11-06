package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by gjorgi.hristovski on 06-Nov-18 in 10:31
 * Created in guru.springframework.sfgpetclinic.repositories for sfg-pet-clinic
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
