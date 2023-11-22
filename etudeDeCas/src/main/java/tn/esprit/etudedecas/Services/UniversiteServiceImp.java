package tn.esprit.etudedecas.Services;

import lombok.AllArgsConstructor;
import org.springframework.expression.spel.ast.NullLiteral;
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

    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        Universite universite=universiteRepositories.findById(idUniversite).orElse(null);
        universite.setFoyer(null);
        return universiteRepositories.save(universite);
    }
}
