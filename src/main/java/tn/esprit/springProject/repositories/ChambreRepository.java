package tn.esprit.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.springProject.entities.Chambre;
import tn.esprit.springProject.entities.TypeChambre;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {

    //With Keyword
    //public List<Chambre> findByBloc_IdBlocAndTypeC(Long idB, TypeChambre typeChambre);

    //With Jquery
    @Query("select c from Chambre c where c.bloc.idBloc=:idB and c.typeC=:typeC")
    List<Chambre> getChambreByBlocAndTypeC(@Param("idB") Long idB, @Param("typeC") TypeChambre typeC);

    @Query("select ch from Chambre ch "+
            "INNER JOIN ch.reservations r "+
            "INNER JOIN r.etudiants e "+
            "WHERE e.cin=:cin ")
    List<Chambre> trouverChselonEt(long cin);
}
