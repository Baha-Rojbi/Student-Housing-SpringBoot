package tn.esprit.etudedecas.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.Repositories.UniversiteRepositories;
import tn.esprit.etudedecas.entities.Universite;

@Service
@AllArgsConstructor
public class UniversiteServiceImp implements IUniversiteService{
    private UniversiteRepositories universiteRepositories;
    @Override
    public Universite findByNomFoyer(String nomFoyer) {
        return universiteRepositories.findByFoyerNomFoyer(nomFoyer);
    }
}
