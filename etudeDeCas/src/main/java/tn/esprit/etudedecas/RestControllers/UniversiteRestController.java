package tn.esprit.etudedecas.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}