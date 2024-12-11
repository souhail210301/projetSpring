package tn.esprit.springProject.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.esprit.springProject.entities.Foyer;
import tn.esprit.springProject.services.IFoyerService;

@RestController
@AllArgsConstructor
public class FoyerRestController {

	private IFoyerService iFoyerService;
	
	
	@PostMapping("/addFoyer")
	public Foyer addFoyer(@RequestBody Foyer f) {
		return iFoyerService.addFoyer(f);
		
	}
	
	@PutMapping("/updateFoyer")
	public Foyer updateFoyer(Foyer f) {
		return iFoyerService.updateFoyer(f);
	}
	
	@GetMapping("/deleteFoyer/{idF}")
	public void deleteFoyer(@PathVariable long idF) {
		 iFoyerService.deleteFoyer(idF);
	}
	
	@GetMapping("/retrieveAllFoyer")
	public List<Foyer> retrieveAllFoyer(){
		return iFoyerService.retrieveAllFoyer();
	}
	
	@GetMapping("/retrieveFoyer/{idF}")
	public Foyer retrieveFoyerById(@PathVariable long idF) {
		 return iFoyerService.retrieveFoyerById(idF);
	}

	@PostMapping("/addFoyerAndAffecterToUniv/{idu}")
	public Foyer addFoyerAndAffecterToUniv(@RequestBody Foyer foyer,@PathVariable long idu) {
	return iFoyerService.addFoyerAndAffecterToUniv(foyer, idu);}

	@GetMapping("/getFoyerByNom/{nomF}")
	public Foyer getFoyerByNom(@PathVariable String nomF){
		return iFoyerService.getFoyerByNom(nomF);
	}
}
