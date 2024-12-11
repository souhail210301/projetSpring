package tn.esprit.springProject.entities;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Foyer implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idF;
	private String nomF;
	private long capacityFs;

	@OneToOne(mappedBy ="foyer")
	private Universite universite;

	@OneToMany(mappedBy = "foyer", cascade = CascadeType.ALL)//encapsulé
	private Set<Bloc> blocs;
	
	public long getIdF() {
		return idF;
	}

	public void setIdF(long idF) {
		this.idF = idF;
	}

	public String getNomF() {
		return nomF;
	}

	public void setNomF(String nomF) {
		this.nomF = nomF;
	}

	public long getCapacityFs() {
		return capacityFs;
	}

	public void setCapacityFs(long capacityFs) {
		this.capacityFs = capacityFs;
	}

	public Universite getUniversite() {
		return universite;
	}

	public void setUniversite(Universite universite) {
		this.universite = universite;
	}

	public Set<Bloc> getBlocs() {
		return blocs;
	}

	public void setBlocs(Set<Bloc> blocs) {
		this.blocs = blocs;
	}





	public Foyer(long idF, String nomF, long capacityFs, Universite universite, Set<Bloc> blocs) {
		super();
		this.idF = idF;
		this.nomF = nomF;
		this.capacityFs = capacityFs;
		this.universite = universite;
		this.blocs = blocs;
	}
	
	
}
