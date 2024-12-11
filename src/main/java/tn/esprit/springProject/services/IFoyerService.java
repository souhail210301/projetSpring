package tn.esprit.springProject.services;

import java.util.List;

import tn.esprit.springProject.entities.Chambre;
import tn.esprit.springProject.entities.Foyer;
import tn.esprit.springProject.entities.TypeChambre;

public interface IFoyerService {
	
	public Foyer addFoyer(Foyer foyer);
	
	public Foyer updateFoyer(Foyer foyer);
	
	public List<Foyer> retrieveAllFoyer();
	
	public Foyer retrieveFoyerById(long idF);
	
	public void deleteFoyer(long idF);

	public Foyer addFoyerAndAffecterToUniv(Foyer foyer, long idu);

	public Foyer getFoyerByNom(String nomF);

	}

