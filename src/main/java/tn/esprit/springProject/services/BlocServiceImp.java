package tn.esprit.springProject.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.springProject.entities.Bloc;
import tn.esprit.springProject.entities.Foyer;
import tn.esprit.springProject.repositories.BlocRepository;
import tn.esprit.springProject.repositories.FoyerRepository;

import java.util.List;
@Service
@Slf4j
public class BlocServiceImp implements IBlocService{
    @Autowired
    private BlocRepository blocRepository;
    @Autowired
    private  FoyerRepository foyerRepository;
    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }


   // @Scheduled(fixedRate = 5000)
   // @Scheduled(cron = "0/15 * * * * *")
    @Override
    public List<Bloc> retrieveAllBloc() {


        List<Bloc> listB = blocRepository.findAll();
        log.info("Taille Totale : " + listB.size());
        for (Bloc b: listB){
            log.info("Bloc : "+ b);
        }
        return listB;
    }

    @Override
    public Bloc retrieveBlocById(long idB) {
        return blocRepository.findById(idB).orElse(null);
    }

    @Override
    public void deleteBloc(long idB) {
        blocRepository.deleteById(idB);
    }

    @Override
    public Bloc affecterBlocAFoyer(long idb, long idf) {
        Bloc bloc = blocRepository.findById(idb).orElse(null);
        Foyer foyer = foyerRepository.findById(idf).orElse(null);
        bloc.setFoyer(foyer);
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc getBlocByCapacity(Long capacityB) {
        return blocRepository.getBlocByCapacityBloc(capacityB);
    }
}
