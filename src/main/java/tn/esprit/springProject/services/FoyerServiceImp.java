package tn.esprit.springProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.esprit.springProject.entities.Bloc;
import tn.esprit.springProject.entities.Foyer;
import tn.esprit.springProject.entities.Universite;
import tn.esprit.springProject.repositories.FoyerRepository;
import tn.esprit.springProject.repositories.UniversiteRepository;


@Service
public class FoyerServiceImp implements IFoyerService{
@Autowired
	private FoyerRepository foyerRepository;
@Autowired
	private UniversiteRepository universiteRepository;
	

	@Override
	public Foyer addFoyer(Foyer foyer) {
		return foyerRepository.save(foyer);
	}

	@Override
	public Foyer updateFoyer(Foyer foyer) {
		return foyerRepository.save(foyer);
	}

	@Override
	public List<Foyer> retrieveAllFoyer() {
		return foyerRepository.findAll();
	}

	@Override
	public Foyer retrieveFoyerById(long idF) {
		return foyerRepository.findById(idF).orElse(null);
	}
	
	@Override
	public void deleteFoyer(long idF) {	
		foyerRepository.deleteById(idF);
	}

	@Override
	public Foyer addFoyerAndAffecterToUniv(Foyer foyer, long idu) {
		Universite universite = universiteRepository.findById(idu).orElse(null);
		for (Bloc bloc : foyer.getBlocs()){
			bloc.setFoyer(foyer);
		}
		Foyer savedFoyer = foyerRepository.save(foyer);
		foyer.setUniversite(universite);
		universite.setFoyer(savedFoyer);
		universiteRepository.save(universite);
		return savedFoyer;
	}

	@Override
	public Foyer getFoyerByNom(String nomF) {
		return foyerRepository.findByNomF(nomF);
	}


}
