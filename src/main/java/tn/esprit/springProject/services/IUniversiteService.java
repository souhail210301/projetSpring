package tn.esprit.springProject.services;

import org.springframework.stereotype.Service;
import tn.esprit.springProject.entities.Foyer;
import tn.esprit.springProject.entities.Universite;

import java.util.List;
public interface IUniversiteService {


    public Universite addUniversite(Universite universite);

    public Universite updateUniversite(Universite universite);

    public List<Universite> retrieveAllUniversite();

    public Universite retrieveUniversiteById(long idU);

    public void deleteUniversite(long idU);
    public Universite affectationFoyer(long idf, long idu);

    public Universite DesaffectationFoyer(long idu);

}
