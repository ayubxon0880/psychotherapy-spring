package uz.psychotherapy.psychotherapybackend.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Direction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String direction;
    @ManyToMany(mappedBy = "directions")
    private List<Clinic> clinics;
}
