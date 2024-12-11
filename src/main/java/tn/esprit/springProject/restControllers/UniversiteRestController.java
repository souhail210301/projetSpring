package tn.esprit.springProject.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springProject.entities.Universite;
import tn.esprit.springProject.services.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UniversiteRestController {

    @Autowired
    private IUniversiteService iUniversiteService;

    // Add Universite
    @PostMapping("addUniversite")
    public Universite addUniversite(@RequestBody Universite U) {
        return iUniversiteService.addUniversite(U);
    }

    // Update Universite with complete data
    @PutMapping("updateUniversite")
    public Universite updateUniversite(@RequestBody Universite U) {
        return iUniversiteService.updateUniversite(U);
    }


    // Retrieve all Universites
    @GetMapping("retrieveAllUniversite")
    public List<Universite> retrieveAllUniversites() {
        return iUniversiteService.retrieveAllUniversite();
    }

    // Retrieve Universite by ID
    @GetMapping("retrieveUniversite/{idU}")
    public Universite retrieveUniversite(@PathVariable long idU) {
        return iUniversiteService.retrieveUniversiteById(idU);
    }

    @PostMapping("/affectFoyerUniv/{idf}/{idu}")
    public Universite affectationFoyer(@PathVariable long idf, @PathVariable long idu) {
        return iUniversiteService.affectationFoyer(idf, idu);
    }

    @PostMapping("/desaffectFoyerUniv/{idu}")
    public Universite DesaffectationFoyer(@PathVariable long idu) {
        return iUniversiteService.DesaffectationFoyer(idu);
    }

}

