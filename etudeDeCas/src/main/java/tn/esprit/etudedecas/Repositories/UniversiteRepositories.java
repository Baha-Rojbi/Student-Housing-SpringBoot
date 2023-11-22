package tn.esprit.etudedecas.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudedecas.entities.Universite;

public interface UniversiteRepositories extends JpaRepository<Universite,Long> {
    public Universite findByFoyerNomFoyer(String nomFoyer);
    public Universite findByNomUniversite(String nomUniversite);
}
