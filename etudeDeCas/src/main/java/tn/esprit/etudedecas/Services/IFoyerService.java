package tn.esprit.etudedecas.Services;

import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    public Foyer addFoyer(Foyer _foyer);
    public Foyer updateFoyer(Foyer _foyer);
    public List<Foyer> getAllFoyer();
    public Foyer getFoyerById(long idF);
    public void deleteFoyer(long idF);
    Foyer addFoyerAndAssignToUniversity(Foyer f, Long idUniver);
}
