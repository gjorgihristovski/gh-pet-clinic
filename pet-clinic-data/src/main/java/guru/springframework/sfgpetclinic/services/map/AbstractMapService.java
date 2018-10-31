package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.BaseEntity;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.*;

/**
 * Created by gjorgi.hristovski on 30-Oct-18 in 10:43
 * Created in guru.springframework.sfgpetclinic.services.map for sfg-pet-clinic
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> implements CrudService<T, ID> {

    protected Map<Long, T> map = new HashMap<>();

    public Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    public T findByID(ID id){
        return map.get(id);
    }

    public T save(T t){
        if(t != null) {
            if(t.getId() == null){
                t.setId(getNextId());
            }
            map.put(t.getId(), t);
        }else{
            throw new RuntimeException("Object cannot be null");
        }
        return t;
    }

    public void deleteByID(ID id){
        map.remove(id);
    }

    public void delete(T t){
        map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }

    private Long getNextId(){

        Long nextId = null;
        try{
            nextId = Collections.max(map.keySet()) + 1;
        }catch (NoSuchElementException nse){
            nextId = 1L;
        }
        return nextId;
    }
}
