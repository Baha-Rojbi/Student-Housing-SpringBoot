package tn.esprit.etudedecas.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.Repositories.FoyerRepositories;
import tn.esprit.etudedecas.entities.Foyer;

import java.util.List;
@Service
@AllArgsConstructor
public class FoyerServiceImp implements IFoyerService{

   private FoyerRepositories foyerRepositories;
    @Override
    public Foyer addFoyer(Foyer _foyer) {
        return foyerRepositories.save(_foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer _foyer) {
        return foyerRepositories.save(_foyer);
    }

    @Override
    public List<Foyer> getAllFoyer() {
        return foyerRepositories.findAll();
    }

    @Override
    public Foyer getFoyerById(long idF) {
        return foyerRepositories.findById(idF).orElse(null);
    }

    @Override
    public void deleteFoyer(long idF) {
        foyerRepositories.deleteById(idF);
    }
}
