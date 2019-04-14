package guru.springframework.sfgspring.services.map;

import guru.springframework.sfgspring.model.Speciality;
import guru.springframework.sfgspring.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialtyService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Optional<Speciality> findById(Long id) {
        return super.findById(id);
    }
}
