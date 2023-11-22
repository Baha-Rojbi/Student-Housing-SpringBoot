package tn.esprit.etudedecas.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.Repositories.FoyerRepositories;
import tn.esprit.etudedecas.Repositories.UniversiteRepositories;
import tn.esprit.etudedecas.entities.Foyer;
import tn.esprit.etudedecas.entities.Universite;

@Service
@AllArgsConstructor
public class UniversiteServiceImp implements IUniversiteService{
    private UniversiteRepositories universiteRepositories;
    private FoyerRepositories foyerRepositories;
    @Override
    public Universite findByNomFoyer(String nomFoyer) {
        return universiteRepositories.findByFoyerNomFoyer(nomFoyer);
    }

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Universite universite=universiteRepositories.findByNomUniversite(nomUniversite);
        Foyer foyer=foyerRepositories.findById(idFoyer).orElse(null);
        universite.setFoyer(foyer);
        return universiteRepositories.save(universite);
    }
}
