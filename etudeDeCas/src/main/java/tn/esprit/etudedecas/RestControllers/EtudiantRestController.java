package tn.esprit.etudedecas.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.Services.IEtudiantService;
import tn.esprit.etudedecas.entities.Etudiant;

import java.util.List;

@RestController
@AllArgsConstructor
public class EtudiantRestController {
    private IEtudiantService iEtudiantService;
    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant E){
        return iEtudiantService.addEtudiant(E);
    }
@PutMapping("/updateEtudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant E){
        return iEtudiantService.updateEtudian(E);
    }
    @GetMapping("/showEtudiant")
    public List<Etudiant> getAllEtudiant(){
        return iEtudiantService.getAllEtudiant();
    }
    @GetMapping("/showById/{idE}")
    public Etudiant getEtudiantById(@PathVariable long idE){
        return iEtudiantService.getEtudiantById(idE);
    }
    @DeleteMapping("/deleteEtudiant/{idE}")
    public void deleteEtudiant(@PathVariable long idE){
        iEtudiantService.deleteEtudiant(idE);
    }

}
