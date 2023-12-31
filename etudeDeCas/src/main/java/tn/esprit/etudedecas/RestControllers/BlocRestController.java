package tn.esprit.etudedecas.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.Services.IBlocService;
import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.Chambre;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlocRestController {
    public IBlocService iBlocService;
    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc bloc){
        return iBlocService.addBloc(bloc);
    }
    @PutMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc bloc){
        return iBlocService.updateBloc(bloc);
    }
    @GetMapping("/getAllBloc")
    public List<Bloc> getAllBloc(){
        return iBlocService.getAllBloc();
    }
    @GetMapping("/getBlocById/{idBloc}")
    public Bloc getBlocById(@PathVariable Long idBloc){
        return iBlocService.getBlocByID(idBloc);
    }
    @DeleteMapping("/deleteBlocById/{idBloc}")
    public void deleteBlocById(@PathVariable Long idBloc){
        iBlocService.deleteBlocByID(idBloc);
    }
    @PostMapping("addBlocAndAssignToFoyer/{idFoyer}")
    public Bloc addBlocAndAssignToFoyer(@RequestBody Bloc bloc,@PathVariable Long idFoyer){
        return iBlocService.addBlocAndAssignToFoyer(bloc,idFoyer);
    }
    @GetMapping("getBlocbyIdChambre/{idBloc}")
    public Bloc getBlocbyIdChambre(@PathVariable Long idBloc){
        return iBlocService.getBlocbyIdChambre(idBloc);
    }


}
