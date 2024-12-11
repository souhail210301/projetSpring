package tn.esprit.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springProject.entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}
