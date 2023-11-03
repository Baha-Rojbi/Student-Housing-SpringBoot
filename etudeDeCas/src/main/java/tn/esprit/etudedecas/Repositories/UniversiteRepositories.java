package tn.esprit.etudedecas.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudedecas.entities.Universite;

public interface UniversiteRepositories extends JpaRepository<Universite,Long> {
}
