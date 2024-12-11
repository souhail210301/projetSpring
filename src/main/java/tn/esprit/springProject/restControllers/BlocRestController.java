package tn.esprit.springProject.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springProject.entities.Bloc;
import tn.esprit.springProject.services.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlocRestController {

    @Autowired
    private IBlocService iBlocService;

    @PostMapping("addBloc")
    public Bloc addBloc(@RequestBody Bloc B){
        return iBlocService.addBloc(B);
    }

    @PutMapping("updateBloc")
    public Bloc updateEtudiantBloc(Bloc B){
        return iBlocService.updateBloc(B);
    }

    @GetMapping("retrieveAllBloc")
    public List<Bloc> retrieveAllEtBloc() {
        return iBlocService.retrieveAllBloc();
    }

    @GetMapping("retrieveBloc/{idB}")
    public Bloc retrieveBloc(@PathVariable long idB) {
        return iBlocService.retrieveBlocById(idB);
    }

    @PostMapping("affecterBlocAFoyer/{idb}/{idf}")
    public Bloc affecterBlocAFoyer(@PathVariable long idb,@PathVariable long idf) {
        return iBlocService.affecterBlocAFoyer(idb,idf);
    }

    @GetMapping("getBlocByCapacity/{capacityB}")
    public Bloc getBlocByCapacity(@PathVariable Long capacityB){
        return iBlocService.getBlocByCapacity(capacityB);
    }

    }
