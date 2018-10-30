package guru.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by gjorgi.hristovski on 30-Oct-18 in 10:43
 * Created in guru.springframework.sfgpetclinic.services.map for sfg-pet-clinic
 */
public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findByID(ID id){
        return map.get(id);
    }

    T save(ID id, T t){
        map.put(id, t);
        return t;
    }

    void deleteByID(ID id){
        map.remove(id);
    }

    void delete(T t){
        map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }
}
