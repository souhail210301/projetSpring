package tn.esprit.springProject.services;

import tn.esprit.springProject.entities.Etudiant;
import tn.esprit.springProject.entities.Foyer;

import java.util.List;

public interface IEtudiantService{
    public Etudiant addEtudiant(Etudiant etudiant);

    public Etudiant updateEtudiant(Etudiant etudiant);

    public List<Etudiant> retrieveAllEtudiant();

    public Etudiant retrieveEtudiantById(long idE);

    public void deleteEtudiant(long idE);
}
