package tn.esprit.springProject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.springProject.entities.Foyer;
public interface FoyerRepository extends JpaRepository<Foyer, Long>{

	Foyer findByNomF(String nomF);

	
}
