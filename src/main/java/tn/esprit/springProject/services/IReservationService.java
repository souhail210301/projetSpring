package tn.esprit.springProject.services;

import tn.esprit.springProject.repositories.ReservationRepository;

import java.time.LocalDate;

public interface IReservationService {

    public Long getCountByDateDebBetween(LocalDate dateD, LocalDate dateF);
}
