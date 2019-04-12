package guru.springframework.sfgspring.services.map;

import java.util.*;

public abstract class AbstractMapService<T, ID> {
    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    Optional<T> findById(ID id) {
        return Optional.of(map.get(id));
    }

    T save(ID id, T object) {
        map.put(id, object);
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(ele -> ele.getValue().equals(object));
    }
}
