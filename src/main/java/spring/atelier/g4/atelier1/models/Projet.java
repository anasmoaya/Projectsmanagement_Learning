package spring.atelier.g4.atelier1.models;

import jakarta.persistence.*;

@Entity
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public Projet(long i, String description) {
        this.id = i;
        this.description = description;
    }

    public Projet() {

    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private  String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
