package guru.springframework.sfgspring.services.map;

import guru.springframework.sfgspring.model.Vet;
import guru.springframework.sfgspring.services.VetService;

import java.util.Optional;
import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Optional<Vet> findById(Long id) {
        return super.findById(id);
    }
}
