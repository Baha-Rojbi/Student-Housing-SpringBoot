package tn.esprit.etudedecas.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudedecas.entities.Chambre;

public interface ChambreRepositories extends JpaRepository<Chambre,Long> {
}
