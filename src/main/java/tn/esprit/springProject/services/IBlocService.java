package tn.esprit.springProject.services;

import tn.esprit.springProject.entities.Bloc;
import tn.esprit.springProject.entities.Etudiant;

import java.util.List;

public interface IBlocService {

    public Bloc addBloc(Bloc b);

    public Bloc updateBloc(Bloc b);

    public List<Bloc> retrieveAllBloc();

    public Bloc retrieveBlocById(long idB);

    public void deleteBloc(long idB);

    public Bloc affecterBlocAFoyer(long idb, long idf);

    public Bloc getBlocByCapacity(Long capacityB);
}
