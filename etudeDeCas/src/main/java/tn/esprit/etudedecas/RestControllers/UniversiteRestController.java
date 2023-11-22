package tn.esprit.etudedecas.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.etudedecas.Services.IUniversiteService;
import tn.esprit.etudedecas.entities.Universite;

@RestController
@AllArgsConstructor
public class UniversiteRestController {
    public IUniversiteService iUniversiteService;
    @GetMapping("findByNomFoyer/{nomFoyer}")
    public Universite findByNomFoyer(@PathVariable String nomFoyer){
        return iUniversiteService.findByNomFoyer(nomFoyer);
    }
    @PostMapping("affecterFoyerAUniversite/{idFoyer}/{nomUniversite}")
    public Universite affecterFoyerAUniversite(@PathVariable long idFoyer,@PathVariable String nomUniversite){
        return iUniversiteService.affecterFoyerAUniversite(idFoyer,nomUniversite);
    }
    @PostMapping("desaffecterFoyerAUniversite/{idUniversite}")
    public Universite desaffecterFoyerAUniversite(@PathVariable long idUniversite){
        return iUniversiteService.desaffecterFoyerAUniversite(idUniversite);
    }
}
