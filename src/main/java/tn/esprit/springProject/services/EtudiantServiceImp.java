package tn.esprit.springProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springProject.entities.Etudiant;
import tn.esprit.springProject.repositories.EtdudiantRepository;

import java.util.List;

@Service
public class EtudiantServiceImp implements IEtudiantService {
    @Autowired
    private EtdudiantRepository etdudiantRepository;


    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etdudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etdudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> retrieveAllEtudiant() {
        return etdudiantRepository.findAll();
    }

    @Override
    public Etudiant retrieveEtudiantById(long idE) {
        return etdudiantRepository.findById(idE).orElse(null);
    }

    @Override
    public void deleteEtudiant(long idE) {
        etdudiantRepository.deleteById(idE);

    }
}
