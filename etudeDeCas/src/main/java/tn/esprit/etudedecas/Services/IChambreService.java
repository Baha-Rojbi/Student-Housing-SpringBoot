package tn.esprit.etudedecas.Services;

import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.Chambre;

import java.util.List;

public interface IChambreService {
    public Chambre addChambre(Chambre chambre);
    public Chambre updateChambre(Chambre chambre);
    public List<Chambre> getAllChambre();
    public Chambre getChambreById(Long idChambre);
    public void deleteChambre(Long idChambre);
    public Chambre addChambreAndAssingToBloc(Chambre chambre, Long idBloc);
}
