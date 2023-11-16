package tn.esprit.etudedecas.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.Repositories.ChambreRepositories;
import tn.esprit.etudedecas.entities.Chambre;

import java.util.List;
@Service
@AllArgsConstructor
public class ChambreServiceImp implements IChambreService{
    public ChambreRepositories chambreRepositories;
    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepositories.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepositories.save(chambre);
    }

    @Override
    public List<Chambre> getAllChambre() {
        return chambreRepositories.findAll();
    }

    @Override
    public Chambre getChambreById(Long idChambre) {
        return chambreRepositories.findById(idChambre).orElse(null);
    }

    @Override
    public void deleteChambre(Long idChambre) {
        chambreRepositories.deleteById(idChambre);
    }
}
