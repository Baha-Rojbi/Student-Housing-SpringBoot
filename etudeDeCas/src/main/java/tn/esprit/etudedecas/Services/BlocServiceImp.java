package tn.esprit.etudedecas.Services;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.Repositories.BlocRepositories;
import tn.esprit.etudedecas.Repositories.ChambreRepositories;
import tn.esprit.etudedecas.Repositories.FoyerRepositories;
import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.Chambre;
import tn.esprit.etudedecas.entities.Foyer;

import java.util.*;

@Service
@AllArgsConstructor
public class BlocServiceImp implements IBlocService{
    public BlocRepositories blocRepositories;
    public FoyerRepositories foyerRepositories;
    public ChambreRepositories chambreRepositories;

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
        Foyer foyer=foyerRepositories.findById(idFoyer).orElse(null);
        bloc.setFoyer(foyer);
        return blocRepositories.save(bloc);
    }

    @Override
    public Bloc getBlocbyIdChambre(Long idChambre) {
        return blocRepositories.findByChambresIdChambre(idChambre);
    }

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) {
        Bloc bloc=blocRepositories.findById(idBloc).orElse(null);
        List<Chambre> chambres=chambreRepositories.findAllById(numChambre);
        Set<Chambre> chambreSet = new HashSet<>(chambres);
        bloc.setChambres(chambreSet);
        for (Chambre chambre : chambreSet) {
            chambre.setBloc(bloc);
        }
        return blocRepositories.save(bloc);
    }


}
