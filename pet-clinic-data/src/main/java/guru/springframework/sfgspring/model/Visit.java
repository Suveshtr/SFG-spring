package guru.springframework.sfgspring.model;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

    @Column(name = "localdate")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name="pet_id")
    private Pet pet;

    public Visit(LocalDate date, String description, Pet pet) {
        this.date = date;
        this.description = description;
        this.pet = pet;
    }


}
