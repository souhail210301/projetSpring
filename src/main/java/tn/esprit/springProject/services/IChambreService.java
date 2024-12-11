package tn.esprit.springProject.services;

import tn.esprit.springProject.entities.Bloc;
import tn.esprit.springProject.entities.Chambre;
import tn.esprit.springProject.entities.TypeChambre;


import java.util.List;

public interface IChambreService {

    public Chambre addChambre(Chambre chambre);

    public Chambre updateChambre(Chambre chambre);

    public List<Chambre> retrieveAllChambre();

    public Chambre retrieveChambreById(long idC);

    public void deleteChambre(long idC);

    public Bloc affecterChambreABloc(List<Long> numC, long idb);

    public List<Chambre> getChambreByIdBlocAndTypeC(Long idB, TypeChambre typeChambre);

    public List<Chambre> trouverChselonEt (long cin);

}
