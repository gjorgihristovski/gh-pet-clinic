package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * Created by gjorgi.hristovski on 30-Oct-18 in 08:16
 * Created in guru.springframework.sfgpetclinic.services for sfg-pet-clinic
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
