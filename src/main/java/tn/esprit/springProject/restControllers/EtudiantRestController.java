package tn.esprit.springProject.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springProject.entities.Etudiant;
import tn.esprit.springProject.services.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
public class EtudiantRestController {

    @Autowired
    private IEtudiantService iEtudiantService;


    @PostMapping("addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant E){
        return iEtudiantService.addEtudiant(E);
    }

    @PutMapping("updateEtudiant")
    public Etudiant updateEtudiant(Etudiant E){
        return iEtudiantService.updateEtudiant(E);
    }

    @PutMapping("updateEtudiant/{idE}")
    public Etudiant updateEtudiant(@PathVariable long idE, @RequestBody Etudiant E) {
        Etudiant existingEtudiant = iEtudiantService.retrieveEtudiantById(idE);
        if (existingEtudiant != null) {
        existingEtudiant.setNomEtudiant(E.getNomEtudiant());
        existingEtudiant.setPrenomEtudiant(E.getPrenomEtudiant());
        existingEtudiant.setCin(E.getCin());
        existingEtudiant.setEcole(E.getEcole());
        existingEtudiant.setDateNaissance(E.getDateNaissance());
            return iEtudiantService.updateEtudiant(existingEtudiant);
        }
        return null;
    }

        @GetMapping("retrieveAllEtudiant")
    public List<Etudiant> retrieveAllEtudiant() {
        return iEtudiantService.retrieveAllEtudiant();
    }

    @GetMapping("retrieveEtudiant/{idE}")
    public Etudiant retrieveEtudiant(@PathVariable long idE) {
        return iEtudiantService.retrieveEtudiantById(idE);
    }
}
