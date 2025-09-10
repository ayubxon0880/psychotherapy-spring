package uz.psychotherapy.psychotherapybackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.psychotherapy.psychotherapybackend.model.Specialist;

@Repository
public interface SpecialistRepository extends JpaRepository<Specialist, Long> {

}