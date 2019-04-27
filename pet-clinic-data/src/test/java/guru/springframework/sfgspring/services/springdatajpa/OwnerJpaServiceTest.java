package guru.springframework.sfgspring.services.springdatajpa;

import guru.springframework.sfgspring.model.Owner;
import guru.springframework.sfgspring.repositories.OwnerRepository;
import guru.springframework.sfgspring.repositories.PetRepository;
import guru.springframework.sfgspring.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OwnerJpaServiceTest {

    public static final String LAST_NAME = "Smith";
    public static final Long ID = 1L;

    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetRepository petRepository;
    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerJpaService ownerJpaService;
    private Owner returnedOwner;


    @BeforeEach
    void setUp() {
        returnedOwner = Owner.builder().id(ID).lastName(LAST_NAME).build();
    }

    @Test
    void findByLastName() {

        when(ownerRepository.findByLastName(any())).thenReturn(returnedOwner);
        Owner smith = ownerJpaService.findByLastName(LAST_NAME);
        assertEquals( LAST_NAME, smith.getLastName());
        verify(ownerRepository, times(1)).findByLastName(LAST_NAME);
    }

    @Test
    void findAll() {
        Set<Owner> returnedOwnerSet = new HashSet<>();
        returnedOwnerSet.add(Owner.builder().id(1L).build());
        returnedOwnerSet.add(Owner.builder().id(2L).build());

        when(ownerRepository.findAll()).thenReturn(returnedOwnerSet);

        Set<Owner> owners = ownerJpaService.findAll();
        assertEquals(returnedOwnerSet.size(), owners.size());
        verify(ownerRepository, times(1)).findAll();

    }

    @Test
    void findById() {

        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnedOwner));
        Optional<Owner> ownerOptional= ownerJpaService.findById(ID);
        assertTrue(ownerOptional.isPresent());
        assertEquals(ID, ownerOptional.get().getId());
        verify(ownerRepository, times(1)).findById(anyLong());
    }

    @Test
    void findByIdNotFound() {

        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());
        Optional<Owner> ownerOptional= ownerJpaService.findById(ID);

        assertFalse(ownerOptional.isPresent());
        verify(ownerRepository, times(1)).findById(anyLong());
    }


    @Test
    void save() {
        Owner ownerTosave = Owner.builder().id(ID).build();
        when(ownerRepository.save(any())).thenReturn(returnedOwner);

        Owner savedOwner = ownerJpaService.save(ownerTosave);

        assertNotNull(savedOwner);
        verify(ownerRepository, times(1)).save(any());
    }

    @Test
    void delete() {
        ownerJpaService.delete(returnedOwner);
        verify(ownerRepository, times(1)).delete(any());
    }

    @Test
    void deleteById() {
        ownerJpaService.deleteById(ID);
        verify(ownerRepository).deleteById(anyLong());
    }
}