package guru.springframework.sfgspring.model;

import java.time.LocalDate;

public class Visit extends BaseEntity {
    private LocalDate date;
    private String description;
    private Pet pet;

    public Visit(LocalDate date, String description, Pet pet) {
        this.date = date;
        this.description = description;
        this.pet = pet;
    }
}
