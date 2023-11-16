package tn.esprit.etudedecas.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.etudedecas.entities.Etudiant;
import tn.esprit.etudedecas.entities.Reservation;

import java.util.Date;
import java.util.List;

public interface EtudiantRepositories extends JpaRepository<Etudiant,Long> {
public List<Etudiant> findByNomEt(String nom);
@Query("SELECT e from Etudiant e where e.nomEt=:nom")
    public List<Etudiant> getEtudiantByNom(@Param("nom") String nom);
public List<Etudiant> findByDateNaissanceBetween(Date dateDebut,Date dateFin);


}
