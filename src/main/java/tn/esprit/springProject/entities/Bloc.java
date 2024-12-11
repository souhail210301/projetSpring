package tn.esprit.springProject.entities;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Bloc implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idBloc;
	private String nomBloc;
	private long capacityBloc;
	@OneToMany(mappedBy = "bloc")
	@JsonIgnore
	@ToString.Exclude
	private Set<Chambre> chambres;
	@ManyToOne
	@JsonIgnore
	@ToString.Exclude
	private Foyer foyer;
	
}
