package tn.esprit.etudedecas.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.Services.IFoyerService;
import tn.esprit.etudedecas.entities.Foyer;

import java.util.List;

@RestController

public class FoyerRestController {
    @Autowired

    private IFoyerService iFoyerService;
    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer _foyer){
return iFoyerService.addFoyer(_foyer);
    }
    @PutMapping("/updateFoyer")
    public Foyer updateFoyer(@RequestBody Foyer _foyer){
return iFoyerService.updateFoyer(_foyer);
    }
    @GetMapping("/showFoyer")
    public List<Foyer> getAllFoyer(){
return iFoyerService.getAllFoyer();
    }
    @GetMapping("/showById/{idF}")
    public Foyer getFoyerById(@PathVariable long idF){
return iFoyerService.getFoyerById(idF);
    }
    @DeleteMapping("deleteFoyer/{idF}")
    public void deleteFoyer(@PathVariable long idF){
        iFoyerService.deleteFoyer(idF);
    }
}
