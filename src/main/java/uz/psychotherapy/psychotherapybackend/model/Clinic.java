package uz.psychotherapy.psychotherapybackend.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Clinic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phoneNumber;
    private String address;
    private String website;
    private String nextToAddress;
    private String email;
    private LocalDateTime startWorkTime;
    private LocalDateTime endWorkTime;
    @ManyToMany
    @JoinTable(
            name = "clinic_direction",
            joinColumns = @JoinColumn(name = "clinic_id"),
            inverseJoinColumns = @JoinColumn(name = "direction_id")
    )
    private List<Direction> directions;
    private String licence;
    private String mission;
    @ManyToMany
    @JoinTable(
            name = "clinic_features",
            joinColumns = @JoinColumn(name = "clinic_id"),
            inverseJoinColumns = @JoinColumn(name = "feature_id")
    )
    private List<Feature> features;
    @OneToMany(mappedBy = "clinic")
    private List<Image> images;
    private String video;
    private String priceListFile;

}
