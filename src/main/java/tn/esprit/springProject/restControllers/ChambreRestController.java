package tn.esprit.springProject.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springProject.entities.Bloc;
import tn.esprit.springProject.entities.Chambre;
import tn.esprit.springProject.entities.TypeChambre;
import tn.esprit.springProject.services.IBlocService;
import tn.esprit.springProject.services.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
public class ChambreRestController {
    @Autowired
    private IChambreService iChambreService;

    @PostMapping("addChambre")
    public Chambre addChambre(@RequestBody Chambre B) {
        return iChambreService.addChambre(B);
    }

    @PutMapping("updateChambre")
    public Chambre updateChambre(Chambre B) {
        return iChambreService.updateChambre(B);
    }

    @GetMapping("retrieveAllChambre")
    public List<Chambre> retrieveAllEtChambre() {
        return iChambreService.retrieveAllChambre();
    }

    @GetMapping("retrieveChambre/{idC}")
    public Chambre retrieveChambre(@PathVariable long idC) {
        return iChambreService.retrieveChambreById(idC);
    }

    @PostMapping("affecterChambreABloc/{idb}")
    public Bloc affecterChambreABloc(@RequestBody List<Long> numC, @PathVariable long idb) {
        return iChambreService.affecterChambreABloc(numC, idb);
    }

    @GetMapping("getChambreByIdBlocAndTypeC/{idB}/{typeC}")
    public List<Chambre> getChambreByIdBlocAndTypeC(@PathVariable long idB,@PathVariable  TypeChambre typeC) {
        return iChambreService.getChambreByIdBlocAndTypeC(idB, typeC);
    }
    @GetMapping("trouverChselonEt/{cin}")
    public List<Chambre> trouverChselonEt(@PathVariable("cin") long cin){
        return iChambreService.trouverChselonEt(cin);
    }


}
