package tn.esprit.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springProject.entities.Reservation;

import java.time.LocalDate;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    Long countByDateDebBetween(LocalDate dateD, LocalDate dateF);
}
