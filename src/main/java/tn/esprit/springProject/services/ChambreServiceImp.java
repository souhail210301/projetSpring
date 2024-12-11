package tn.esprit.springProject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springProject.entities.Bloc;
import tn.esprit.springProject.entities.Chambre;
import tn.esprit.springProject.entities.TypeChambre;
import tn.esprit.springProject.repositories.BlocRepository;
import tn.esprit.springProject.repositories.ChambreRepository;

import java.util.List;
@Service
public class ChambreServiceImp implements IChambreService{
    @Autowired
    private ChambreRepository chambreRepository;
    @Autowired
    private BlocRepository blocRepository;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> retrieveAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre retrieveChambreById(long idC) {
        return chambreRepository.findById(idC).orElse(null);
    }

    @Override
    public void deleteChambre(long idC) {
        chambreRepository.deleteById(idC);

    }

    @Override
    public Bloc affecterChambreABloc(List<Long> numC, long idb) {
        Bloc bloc = blocRepository.findById(idb).orElse(null);
        List<Chambre> chambreList = chambreRepository.findAllById(numC);
        for (Chambre chambre : chambreList){
            chambre.setBloc(bloc);
        }
        chambreRepository.saveAll(chambreList);
        return bloc;
    }

    @Override
    public List<Chambre> getChambreByIdBlocAndTypeC(Long idB, TypeChambre typeChambre) {
        return chambreRepository.getChambreByBlocAndTypeC(idB, typeChambre);
    }

    @Override
    public List<Chambre> trouverChselonEt(long cin) {
        return chambreRepository.trouverChselonEt(cin);
    }


}
