package tn.esprit.springProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.springProject.entities.Reservation;
import tn.esprit.springProject.repositories.ReservationRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReservationServiceImp implements IReservationService{

    @Autowired
    private ReservationRepository reservationRepository;
    @Override
    public Long getCountByDateDebBetween(LocalDate dateD, LocalDate dateF) {
        return reservationRepository.countByDateDebBetween(dateD, dateF);
    }

    @Scheduled(fixedRate = 50000)
    public void mettreAJourEtAfficherReservations() {

        LocalDate dateLimite = LocalDate.of(2024, 1, 1);

        List<Reservation> reservations = reservationRepository.findAll();

        for (Reservation reservation : reservations) {
            if (reservation.getDateDeb().compareTo(dateLimite) < 0) {
                reservation.setEstValide(false);
                reservationRepository.save(reservation);
            }
        }

    }}