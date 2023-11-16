package tn.esprit.etudedecas.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.Chambre;

import java.util.List;

public interface BlocRepositories extends JpaRepository<Bloc,Long> {
    public Bloc findByChambresIdChambre(Long idChambre);
}
