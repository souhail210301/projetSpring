package tn.esprit.springProject.entities;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Reservation implements Serializable  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idReservation;
	private Date anneeUniversitaire;
	private boolean estValide;
	private LocalDate dateDeb;
	private LocalDate dateFin;
	@ManyToMany
	private Set<Etudiant> etudiants;
	
}
