package tn.esprit.etudedecas.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.Services.IChambreService;
import tn.esprit.etudedecas.entities.Chambre;

import java.util.List;
@RestController
@AllArgsConstructor
public class ChambreRestController {
    public IChambreService iChambreService;
    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre chambre){
        return iChambreService.addChambre(chambre);
    }
    @PostMapping("/updateChambre")
    public Chambre updateChambre(@RequestBody Chambre chambre) {return iChambreService.updateChambre(chambre);}
    @GetMapping("/getAllChambre")
    public List<Chambre> getAllChambre(){
       return iChambreService.getAllChambre();
    }
    @GetMapping("/getChambreById/{idChambre}")
    public Chambre getChambreById(@PathVariable Long idChambre){
       return iChambreService.getChambreById(idChambre);
    }
    @DeleteMapping("/deleteChambre/{idChambre}")
    public void deleteChambre(@PathVariable Long idChambre){
        iChambreService.deleteChambre(idChambre);
    }
    @PostMapping("addChambreAndAssingToBloc/{idBloc}")
    public Chambre addChambreAndAssingToBloc(@RequestBody Chambre chambre,@PathVariable Long idBloc){
        return iChambreService.addChambreAndAssingToBloc(chambre,idBloc);
    }
}
