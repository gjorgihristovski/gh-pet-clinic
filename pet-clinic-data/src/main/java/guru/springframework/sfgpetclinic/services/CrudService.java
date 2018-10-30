package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by gjorgi.hristovski on 30-Oct-18 in 10:33
 * Created in guru.springframework.sfgpetclinic.services for sfg-pet-clinic
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findByID(ID id);

    T save(T t);

    void delete(T t);

    void deleteByID(ID id);

}
