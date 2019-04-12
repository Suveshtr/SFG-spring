package guru.springframework.sfgspring.services.map;

import guru.springframework.sfgspring.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    Optional<T> findById(ID id) {
        return Optional.of(map.get(id));
    }

    T save(T object) {
        if(object != null) {
            if(object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(ele -> ele.getValue().equals(object));
    }

    private Long getNextId() {
        Long nextId = map.isEmpty() ? 1L : Collections.max(map.keySet()) + 1;

        return nextId;
    }
}
