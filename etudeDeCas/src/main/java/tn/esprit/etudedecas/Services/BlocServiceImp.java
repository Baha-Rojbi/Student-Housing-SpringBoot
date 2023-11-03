package tn.esprit.etudedecas.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.Repositories.BlocRepositories;
import tn.esprit.etudedecas.entities.Bloc;

import java.util.List;
@Service
@AllArgsConstructor
public class BlocServiceImp implements IBlocService{
    public BlocRepositories blocRepositories;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepositories.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepositories.save(bloc);
    }

    @Override
    public List<Bloc> getAllBloc() {
        return blocRepositories.findAll();
    }

    @Override
    public Bloc getBlocByID(long idBloc) {
        return blocRepositories.findById(idBloc).orElse(null);
    }

    @Override
    public void deleteBlocByID(long idBloc) {
        blocRepositories.deleteById(idBloc);
    }

    @Override
    public Bloc addBlocAndAssignToFoyer(Bloc bloc, Long idFoyer) {
        return null;
    }

    @Override
    public Bloc addBlocAndAssignToChambre(Bloc b, Long idChambre) {
        return null;
    }
}
