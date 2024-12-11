package tn.esprit.springProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springProject.entities.Foyer;
import tn.esprit.springProject.entities.Universite;
import tn.esprit.springProject.repositories.FoyerRepository;
import tn.esprit.springProject.repositories.UniversiteRepository;

import java.util.List;

@Service
public class UniversiteServiceImp implements IUniversiteService{


    @Autowired
    private UniversiteRepository universiteRepository;
    @Autowired
    private FoyerRepository foyerRepository;


    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public List<Universite> retrieveAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite retrieveUniversiteById(long idU) {
        return universiteRepository.findById(idU).orElse(null);
    }

    @Override
    public void deleteUniversite(long idU) {
        universiteRepository.deleteById(idU);

    }

    @Override
    public Universite affectationFoyer(long idf, long idu) {
        Foyer foyer = foyerRepository.findById(idf).orElse(null);
        Universite universite = universiteRepository.findById(idu).orElse(null);
        universite.setFoyer(foyer);
        return universiteRepository.save(universite);

    }

    @Override
    public Universite DesaffectationFoyer(long idu){
        Universite universite = universiteRepository.findById(idu).orElse(null);
        universite.setFoyer(null);
        return universiteRepository.save(universite);
    }



}
