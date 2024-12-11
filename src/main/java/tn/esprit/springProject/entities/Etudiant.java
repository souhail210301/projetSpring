package tn.esprit.springProject.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Etudiant implements Serializable  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEtudiant;
	private String nomEtudiant;
	private String prenomEtudiant;
	private long cin;
	private String ecole;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;

	@JsonIgnore
	@ManyToMany(mappedBy = "etudiants")
	private Set<Reservation> reservations;
	
}
