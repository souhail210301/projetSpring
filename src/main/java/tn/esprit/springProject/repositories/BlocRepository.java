package tn.esprit.springProject.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.springProject.entities.Bloc;

public interface BlocRepository extends JpaRepository<Bloc, Long> {

    @Query("select b from Bloc b where b.capacityBloc=:capacityB")
    Bloc getBlocByCapacityBloc(@Param("capacityB") Long capaityB);

}
