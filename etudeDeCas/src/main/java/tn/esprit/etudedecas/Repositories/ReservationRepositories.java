package tn.esprit.etudedecas.Repositories;

import jdk.dynalink.linker.LinkerServices;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudedecas.entities.Etudiant;
import tn.esprit.etudedecas.entities.Reservation;

import java.util.List;

public interface ReservationRepositories extends JpaRepository<Reservation,Long> {
 // public List<Reservation> findByEtudiantsByIdEtudiant(Long idEtudiant);

 //public List<Reservation> findByEtudiantsNomEt(String nomEt);
// public List<Reservation>  findByEtudiantNomEtStartingWith(String prefix);
}
