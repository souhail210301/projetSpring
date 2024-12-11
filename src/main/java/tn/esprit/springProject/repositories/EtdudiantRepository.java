package tn.esprit.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.springProject.entities.Etudiant;

import java.util.Date;

public interface EtdudiantRepository  extends JpaRepository<Etudiant, Long> {

//@Query("select e from etudiant e where e.dateNaissance= date")
    Etudiant findEtudiantByDateNaissanceGreaterThan(String e, Date d);


}
