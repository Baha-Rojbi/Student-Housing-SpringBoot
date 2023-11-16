package tn.esprit.etudedecas.Services;

import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.Chambre;

import java.util.List;

public interface IBlocService {
    public Bloc addBloc (Bloc bloc);
    public Bloc updateBloc(Bloc bloc);
    public List<Bloc> getAllBloc();
    public Bloc getBlocByID(long idBloc);
    public void deleteBlocByID(long idBloc);
    public Bloc addBlocAndAssignToFoyer(Bloc bloc, Long idFoyer);
    public Bloc getBlocbyIdChambre(Long idChambre);


}
